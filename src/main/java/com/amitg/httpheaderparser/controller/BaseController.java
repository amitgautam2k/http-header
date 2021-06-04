package com.amitg.httpheaderparser.controller;

import com.amitg.httpheaderparser.PaginationEditor;
import com.amitg.httpheaderparser.model.PaginationInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

public class BaseController {
    static final Logger logger = LoggerFactory.getLogger(BaseController.class);

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        logger.info("initBinder invoked");
        binder.registerCustomEditor(PaginationInfo.class, new PaginationEditor());
    }
}
