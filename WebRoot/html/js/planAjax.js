function ajaxPlan(id){
	$.ajax({
		type:"POST",
		url:"salPlan_ajaxPlan",
		data:{"salplan.plaId":id,"salplan.plaTodo":$("#to_do").val()},
		error:function(){
			alert("ajaxPlan");
		}
	});
}