package com.tomcartlabs.kmdemo

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping

@Controller
class HtmlController {

    @GetMapping("/")
    fun kmdemo(model: Model): String {
        model["title"] = "KM Demo"
        return "kmdemo"
    }

}