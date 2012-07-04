package eastwoodemo

class DemoController {
	

	def index  = {
		
			renderPdf(template: "charts", model: [stuff:'hello'], filename: "chart.pdf")
			
	}
	
	def savetofile = {
		
		/*withHttp(uri: "http://www.google.com") {
			def html = get(path : '/search', query : [q:'Groovy'])
			assert html.HEAD.size() == 1
			assert html.BODY.size() == 1
			println html
		 }
		*/
		
		println "${request.contextPath}"
		
		withHttp(uri: "${request.contextPath}") {
			def html = get(path : '/chart', query : [cht:'p3',chd:'s',chs:'250x100',chl:'Hello|World' ])
			//assert html.HEAD.size() == 1
			//assert html.BODY.size() == 1
			println html
		 }
		
		render "savetofile"
	}
}