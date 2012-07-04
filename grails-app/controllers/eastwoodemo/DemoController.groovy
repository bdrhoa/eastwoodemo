package eastwoodemo

class DemoController {
	

	def index  = {
		
			renderPdf(template: "charts", model: [stuff:'hello'], filename: "chart.pdf")
			
	}
	
}