package com.kael.jtexttable;

/**
 * Created by 成国栋 on 2017-03-10 23:22:00.
 */
public class TestMain {
  public static void main(String[] args) {
    String[] header = {"姓名", "年龄", "收入"};
    String[][] rows = {
        {"tom", "18", "100"},
        {"cat", "26", "2000", null},
        {"奥巴马儿", "250", "0"}
    };
    System.out.println(new TextTable(header, rows));
  }
}
