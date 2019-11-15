package rechner;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/rechner")
public class OKController {
	@PostMapping
	public String checkOK(@RequestParam("zahl1") String z1, @RequestParam("zahl2") String z2,
			@RequestParam("Operation") String op, CalculatorBean bean) {
		bean.setZahl1(z1);
		bean.setZahl2(z2);
		bean.setOperation(op);
		if (bean.getOK()) {
			System.out.println(bean.getResult());
			return "Result";
		}
		return "Form";
	}

	@GetMapping
	public String start(CalculatorBean bean) {
		return "Form";
	}

}
