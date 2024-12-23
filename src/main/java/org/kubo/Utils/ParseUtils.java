package org.kubo.Utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Arrays;

public class ParseUtils {

    public static int[] strToIntArr(String str) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.readValue(str, int[].class);
        } catch (JsonProcessingException e) {
            return new int[]{};
        }
    }

    public static String[] strToStrArr(String str) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.readValue(str, String[].class);
        } catch (JsonProcessingException e) {
            return null;
        }
    }

    public static int[][] convertStringToIntArray(String str) {
        // 去除首尾的方括号
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.readValue(str, int[][].class);
        } catch (JsonProcessingException e) {
            return null;
        }
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(strToStrArr("[1,2,3]")));
    }
}
