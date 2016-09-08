/**
 * https://spring.io/guides/gs/consuming-rest-jquery/
 * http://api.jquery.com/jquery.getjson/
 */
'use strict';

$(document).ready(function() {
	
	$.getJSON("http://localhost:8080/com.airbus.acdc.simple.rest.service/rest/demo", function(data, textStatus, req) {
//		var items = [];
		var ul = document.getElementById("ct");
		$.each(data, function (key, val) {			
			console.log("add " + val)
			
			var newRow = document.createElement("tr");
			var td = document.createElement("td");
			td.appendChild(document.createTextNode(val.name));
			newRow.appendChild(td);  
		    ul.appendChild(newRow);     
		})
	})
	
	$('#addAS').submit(function() {
		var nameValue = document.getElementById('nameTxt').value;
		
		var newAir = {name:nameValue};
		
		$.ajax({
		    type: "PUT",
		    url: "http://localhost:8080/com.airbus.acdc.simple.rest.service/rest/demo",
		    // The key needs to match your method's input parameter (case-sensitive).
		    data: JSON.stringify(newAir),
		    contentType: "application/json; charset=utf-8",
		    dataType: "json",
		    success: function(data){alert(data);},
		    failure: function(errMsg) {
		        alert(errMsg);
		    }
		});
		
	})
	
	
})



/*
$(document).ready(function() {
	$.ajax({
		url: "http://localhost:8080/com.airbus.acdc.simple.rest.service/rest/demo"
	}).then(function(data) {
		console.log(data)
		console.log(data.lenght)
		var ul = document.getElementById("ct");
		
		$.getJ

    	for( var i = 0; i < 5; i++) // data.length; i++ )
    	{ 
    	    //o = data[i];
    	    var li = document.createElement("li");
    	    li.appendChild(document.createTextNode("hey ho"));
    	    ul.appendChild(li);     
    	} 
	})
})

/*
jQuery.ajax({})
jQuery.ajax({
            url: "/rest/demo",
            type: "GET",

            contentType: 'application/json; charset=utf-8',
            success: function(resultData) {
                //here is your json.
                  // process it
            	console.log(resultData)
            	var ul = document.getElementById("ct");

            	for( var i = 0; i < 5; i++) // data.length; i++ )
            	{ 
            	    //o = data[i];
            	    var li = document.createElement("li");
            	    li.appendChild(document.createTextNode("hey ho"));
            	    ul.appendChild(li);     
            	} 

            },
            error : function(jqXHR, textStatus, errorThrown) {
            },

            timeout: 120000,
        });

*/