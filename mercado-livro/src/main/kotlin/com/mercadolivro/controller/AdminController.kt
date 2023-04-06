package com.mercadolivro.controller

import com.mercadolivro.controller.response.CustomerResponse
import com.mercadolivro.extension.toResponse
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("admin")
class AdminController {

    @GetMapping("/reports")
    fun report(): String{
        return "This is report"
    }

}