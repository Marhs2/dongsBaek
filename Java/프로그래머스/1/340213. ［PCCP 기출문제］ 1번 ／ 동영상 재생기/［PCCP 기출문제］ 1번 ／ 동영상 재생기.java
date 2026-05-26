import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {


        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("mm:ss");

        LocalTime videoLen = LocalTime.parse("00:" + video_len);
        LocalTime startTime = LocalTime.parse("00:" + op_start);
        LocalTime endTime = LocalTime.parse("00:" + op_end);
        LocalTime posTime = LocalTime.parse("00:" + pos);
        if ((startTime.isBefore(posTime) || startTime.equals(posTime)) && (endTime.isAfter(posTime) || endTime.equals(posTime)))
            posTime = endTime;

        for (String ch : commands) {


            if (ch.equals("next")) {
                if (posTime.plusSeconds(10).isAfter(videoLen)) {
                    posTime = videoLen;
                } else {
                    posTime = posTime.plusSeconds(10);

                }
            } else {
                if (posTime.isAfter(LocalTime.of(0, 0, 10))) {
                    posTime = LocalTime.of(0, 0);
                } else {
                    posTime = posTime.minusSeconds(10);

                }
            }

            if (!posTime.isBefore(startTime) && !posTime.isAfter(endTime)) {
                posTime = endTime;
            }


        }


        return posTime.format(formatter);
    }
}