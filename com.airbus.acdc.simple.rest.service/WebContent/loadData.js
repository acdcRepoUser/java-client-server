/**
 * 
 */

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

