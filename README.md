# jtext-table
java输出文本表格，类似于mysql命令行的结果集表格，如下所示：
<pre>
<code>
+---------+------+--------+
| name    | age  | income |
+---------+------+--------+
| tom     | 18   | 100    |
+---------+------+--------+
| cat     | 26   | 2000   |
+---------+------+--------+
| 奥巴马儿 | 250  | 0      |
+---------+------+--------+
</code>
</pre>

使用方法如下所示，new一个TextTable，传递header和行数据，调用toString方法输出即可：
<pre>
<code>
public class TestMain {
  public static void main(String[] args) {
    String[] header = {"name", "age", "income"};
    String[][] rows = {
        {"tom", "18", "100"},
        {"cat", "26", "2000", null},
        {"奥巴马儿", "250", "0"}
    };
    System.out.println(new TextTable(header, rows));
  }
}
</code>
</pre>
