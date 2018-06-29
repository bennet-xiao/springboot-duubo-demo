function addUser(){
	$.ajax({
			"data":JSON.stringify($("#add-user-form").serializeObject()),
			"type":"POST",
			"contentType":"application/json",
			"url":$("#add-user-form").attr("action"),
			"success":function(result){
				alert(result);
			},
			"error":function(){
				alert("somthing wrong");
			}
	});
}

/**
 * 将表单序列化为json数组
 */
$.fn.serializeObject = function()    
{    
   var o = {};    
   var a = this.serializeArray();    
   $.each(a, function() {    
       if (o[this.name]) {    
           if (!o[this.name].push) {    
               o[this.name] = [o[this.name]];    
           }    
           o[this.name].push(this.value || '');    
       } else {    
           o[this.name] = this.value || '';    
       }    
   });    
   return o;    
};  