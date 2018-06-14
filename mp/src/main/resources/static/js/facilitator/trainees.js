$(function() {
	$.getJSON( "http://localhost:8080/api/users", {
	    format: "json"
	  })
	    .done(function( data ) {
	      $.each( data.items, function( i, item ) {
	        $( "<div>" ).attr( "class","hehe").appendTo( "#testDiv" );
	        if ( i === 3 ) {
	          return false;
	        }
	      });
	    });
});


//<tr>
//   <td class="text-center">
//      <div class="avatar d-block" style="background-image: url(demo/faces/female/26.jpg)">
//         <span class="avatar-status bg-green"></span>
//      </div>
//   </td>
//   <td>
//      <div>Elizabeth Martin</div> 
//      <div class="small text-muted">
//         System Applications Engineer Trainee
//      </div>
//   </td>
//   <td>
//      <div>123456789</div>
//   </td>
//   <td>
//      <div class="small text-muted">Last login</div>
//      <div>4 minutes ago</div>
//   </td>
//   <td class="text-center">
//      <div class="mx-auto chart-circle chart-circle-xs" data-value="0.42" data-thickness="3" data-color="red">
//         <div class="chart-circle-value">42%</div>
//      </div>
//   </td>
//   <td class="text-center">
//      <div class="item-action dropdown">
//         <a href="javascript:void(0)" data-toggle="dropdown" class="icon"><i class="fe fe-more-vertical"></i></a>
//         <div class="dropdown-menu dropdown-menu-right">
//            <a href="javascript:void(0)" class="dropdown-item"><i class="dropdown-icon fe fe-tag"></i> Action </a>
//            <a href="javascript:void(0)" class="dropdown-item"><i class="dropdown-icon fe fe-edit-2"></i> Another action </a>
//            <a href="javascript:void(0)" class="dropdown-item"><i class="dropdown-icon fe fe-message-square"></i> Something else here</a>
//            <div class="dropdown-divider"></div>
//            <a href="javascript:void(0)" class="dropdown-item"><i class="dropdown-icon fe fe-link"></i> Separated link</a>
//         </div>
//      </div>
//   </td>
//</tr>