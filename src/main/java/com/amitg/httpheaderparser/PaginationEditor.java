package com.amitg.httpheaderparser;

import com.amitg.httpheaderparser.model.PaginationInfo;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.beans.PropertyEditorSupport;

public class PaginationEditor extends PropertyEditorSupport {
    static final Logger logger = LoggerFactory.getLogger(PaginationEditor.class);

    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        logger.info("setAsText invoked");
        if (StringUtils.isEmpty(text)) {
            setValue(null);
        } else {
            PaginationInfo page = new PaginationInfo();
            String[] pageAttr = text.split("/");
            page.pageIndex = Integer.parseInt(pageAttr[0]);
            page.size = Integer.parseInt(pageAttr[1]);
            setValue(page);
        }
    }
}
