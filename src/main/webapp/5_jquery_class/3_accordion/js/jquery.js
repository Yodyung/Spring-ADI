$(function(){
	$('.accordion').each(function(){
		var allDt = $(this).find('dt');
		var allDd = $(this).find('dd');
		
		allDd.hide();
		allDd.first().show();
		allDt.css({'cursor':'pointer'})
		
		//
		allDt.click(function(){
			//alert('ddd')
			allDd.hide();
			$(this).next().show();
		//fadeIn,slideDown, toggle 등 사용 가능	
			
		});
		
	})
	
	
	
	
	
	
})