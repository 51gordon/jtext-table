package com.github.cgdon.jtexttable;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by 成国栋 on 2017-03-10 22:51:00.
 */
public class TextTableTest {
  @Before
  public void setUp() throws Exception {

  }

  @After
  public void tearDown() throws Exception {

  }

  @Test
  public void testToString() throws Exception {
    String[] header = {"姓名", "年龄", "收入"};
    String[][] rows = {
        {"张三", "18", "100"},
        {"李四", "26", "2000"},
        {"奥巴马儿", "250", "0"}
    };

    System.out.println(new TextTable(header, rows));
  }

}
