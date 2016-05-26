package com.yisenjing.third11;

/**
 * Created by Yisen on 4/11/16.
 */
public class HexadecimalRepresentation {

    public String hex(int number) {

        String prefix = "0x";

        if (number == 0) {
            return prefix + number;
        }

        StringBuilder sb = new StringBuilder();

        while (number > 0) {
            int rem = number % 16;
            if (rem < 10) {
                sb.append((char)('0' + rem));
            } else {
                sb.append((char)(rem - 10 + 'A'));
            }

            number >>>= 4;
        }
        return prefix + sb.reverse().toString();
    }


}
