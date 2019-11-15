package rechner;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import rechner.CalculatorBean;

@Controller
@RequestMapping("/Validate")
public class OKController {
	@GetMapping
	public String checkOK(@RequestParam("zahl1") String z1, @RequestParam("zahl2") String z2,
			@RequestParam("Operation") String operation, Model model) {
		CalculatorBean bean = new CalculatorBean();
		bean.setZahl1(z1);
		bean.setZahl2(z2);
		bean.setOperation(operation);
		model.addAttribute("bean", bean);

		if (bean.getOK()) {
			return "Result";
		}
		return "Error";
	}

}
