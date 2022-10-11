package com.algorithms.strings;

public class URLify {
    public char[] execute(char[] str, int trueLength) {
        int insertIdx = str.length - 1;

        for (int i = trueLength - 1; i >= 0; i--) {
            if (str[i] == ' ') {
                str[insertIdx] = '0';
                str[insertIdx - 1] = '2';
                str[insertIdx - 2] = '%';

                insertIdx -= 3;
            } else {
                str[insertIdx] = str[i];
                insertIdx--;
            }
        }

        return str;
    }
}
