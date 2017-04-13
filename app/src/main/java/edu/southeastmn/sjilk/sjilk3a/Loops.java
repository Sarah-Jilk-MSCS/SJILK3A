package edu.southeastmn.sjilk.sjilk3a;
import java.text.DecimalFormat;
/**
 * Created by sjjilk on 4/12/2017.
 */

public class Loops {
    private int max;

    public Loops(int max) {
        this.max = max;
    }

    public String whileLoop() {
        DecimalFormat fmt = new DecimalFormat("  00");
        StringBuilder output = new StringBuilder("While Loop\nCount\tSum\n=====\t=====\n");
        int total = 0;
        int count = 1;

        while (count <= max)
        {
            total += count;

            output.append(fmt.format(count)); output.append('\t');
            output.append(fmt.format(total)); output.append('\n');

            count += 1;
        }
        //return string
        return output.toString();
    }

    public String doWhileLoop() {
        DecimalFormat fmt = new DecimalFormat("  00");
        StringBuilder output = new StringBuilder("Do-While Loop\nCount\tSum\n=====\t=====\n");
        int total = 0;
        int count = 1;

        do
        {
            total += count;

            output.append(fmt.format(count)); output.append('\t');
            output.append(fmt.format(total)); output.append('\n');

            count += 1;
        } while (count <= max);

        return output.toString();
    }

    public String forLoop() {
        DecimalFormat fmt = new DecimalFormat("  00");
        StringBuilder output = new StringBuilder("For Loop\nCount\tSum\n=====\t=====\n");
        int total = 0;
        int count;

        for (count = 1; count <= max; count++)
        {
            total += count;

            output.append(fmt.format(count)); output.append('\t');
            output.append(fmt.format(total)); output.append('\n');

        }
        return output.toString();
    }
}
