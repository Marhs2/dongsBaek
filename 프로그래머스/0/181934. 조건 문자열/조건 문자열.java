import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

class Solution {
    public int solution(String ineq, String eq, int n, int m) throws ScriptException {
        ScriptEngine js = new ScriptEngineManager().getEngineByName("js");

        String pro = n + ineq + ((eq).equals("!") ? "" : eq) + m;

        boolean bol = (Boolean) js.eval(pro);

        return bol ? 1 : 0;

    }
}