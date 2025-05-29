package cn.idev.excel.test.demo.read;

import cn.idev.excel.annotation.ExcelProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * Basic data class
 *
 * @author Jiaju Zhuang
 **/
@Getter
@Setter
@EqualsAndHashCode
public class MultiNameData2 {



    @ExcelProperty(aliases = {"数学标题2","数学标题1"})
    private String aoubleData;
    @ExcelProperty(value={"字符串标题2","字符串标题1"})
    private String title;

    @ExcelProperty(aliases = {"\"测试,，，，，验证\"","测试,，，，，验证2"})
    private String test2;

    @ExcelProperty(aliases = {"日期标题2","日期标题1"})
    private Date date;

}
