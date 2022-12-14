package co.grandcircus.employeecalendar.AppController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import co.grandcircus.employeecalendar.EventModelFrontEnd.EventFrontEnd;
import co.grandcircus.employeecalendar.EventService.EventService;

@Controller
public class AppController {

	@Autowired
	private EventService es;
	
	
	//DEFAULT will need to change as we go just here to test
	@RequestMapping("/")
	public String showHome(Model model) {
		//should it be event or eventfrontend?
		EventFrontEnd[] events = es.getEvents();
		System.out.print(events[0].getEventName());
		model.addAttribute("events",events);
		return "month";
	}
	
	//will need to change as we go just here to test
	@RequestMapping("/month")
	public String showMonth() {
		return "month";
	}
	
	//will need to change as we go just here to test
	@RequestMapping("/week")
	public String showWeek() {
		return "week";
	}
	
	//will need to change as we go just here to test
	@RequestMapping("/day")
	public String showDay() {
		return "day";
	}
}
