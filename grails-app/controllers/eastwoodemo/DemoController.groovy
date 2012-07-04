package eastwoodemo

class DemoController {
	def pdfRenderingService

	def index  = {
		
			renderPdf(template: "charts", model: [stuff:'hello'], filename: "chart.pdf")
			
	}
	
	def saveToFile = {
		new File("localchart.pdf").withOutputStream { outputStream ->
	    	pdfRenderingService.render(controller:'demo', template: 'charts', model: [stuff:'hello'])
		}
		
		render "saveToFile"
	}
	
	
}