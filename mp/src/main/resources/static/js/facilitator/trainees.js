
    
$(function() {
    var plans = [[]];

    $.ajax({
        dataType: "json",
        url: "http://localhost:8080/api/plan/",
    }).done(function(response) {
    	var modules = [];
		plans.splice(0,1,[]);
    	for(var i=0; i < response.length; i++) {
    		if(response === undefined){
    			console.log(response[i].name);
    			console.log('its now undefined');
    			break;
    		} else {
    			console.log(response[i].planId-1);
    			console.log(response[i].moduleId-1);
    			console.log(response[i].name);
    			plans[]
    			
    			//plans[response[i].planId-1].splice(response[i].moduleId-1,1,response[i].name);
    			//console.log(plans[response[i].planId-1]);
    		}
        }
    	console.log(plans);
    });

    
    $("#userTable").DataTable({
        ajax: {
            url: "http://localhost:8080/api/users",
            dataSrc: ''
        },
        saveState: true,
        order: [
            [3, "desc"]
        ],
        columns: [{
                data: "id"
            },
            {
                // Trainee Name
                data: null,
                render: function(data, type, row) {
                    if (data.middleName === "N/A") {
                        return "Not available";
                    }
                    if (data.middleName === "") {
                        return data.firstName + " " + data.lastName;
                    } else {
                        return data.firstName + " " + data.middleName + " " + data.lastName;
                    }
                }
            },
            {
                // Module Multiselect
                data: null,
                render: function(data, type, row) {
                    var testOut = '<select id="example-getting-started" multiple="multiple" name="' + data.id + '">';

	                if(data.planId === 0){
	                	return "Invalid Plan";
	                } else {

                    	for (var i = 1; i < plans[1].length; i++) {
	                        testOut += '<option value="' + plans[data.planId][i] + '">' + plans[data.planId][i] + '</option>';
	                    }
	                }
                    testOut += '</select>';

                    $('select[name=' + data.id + ']').multiselect({
                        onChange: function(option, checked, select) {
                            var val = $(option).val();
                            if (checked) {
                                $(".multiselect-container li.active").find('input[value=' + val + ']').parent().addClass("crossOut");
                            } else {
                                $(".multiselect-container li").find('input[value=' + val + ']').parent().removeClass("crossOut");
                            }
                        }
                    });

                    return testOut;
                }
            },
            {
                // Progress Bar
                data: null,
                render: function(data, type, row) {
                    return '<div class="progress" style="height: 5px;">' +
                        '<div class="progress-bar bg-green" role="progressbar" style="width: 55%;" aria-valuenow="55" aria-valuemin="0" aria-valuemax="100"></div>' +
                        '</div>';
                }
            },
            {
                // Role Name
                data: null,
                render: function(data, type, row) {
                    return data.roleName.substring(data.roleName.indexOf("_") + 1);
                }
            },
            {
                // Date Created
                data: null,
                render: function(data, type, row) {
                    return moment.utc(data.createdAt).format("MM/DD/YYYY");
                }
            },
        ],
        columnDefs: [{
                targets: 0,
                width: "5%"
            },
            {
                targets: 1,
                width: "60"
            },
            {
                targets: 2,
                width: "10%"
            },
            {
                targets: 3,
                width: "10%"
            },
            {
                targets: 4,
                width: "10%"
            }
        ]
    });
});