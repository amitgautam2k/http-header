package com.amitg.httpheaderparser.controller;

import com.amitg.httpheaderparser.model.PaginationInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
public class HeaderParser extends BaseController {
    static final Logger logger = LoggerFactory.getLogger(HeaderParser.class);

    @RequestMapping("/")
    public PaginationInfo getPagingInfo(@RequestHeader("pagination") PaginationInfo page) {
        return page;
    }
}
