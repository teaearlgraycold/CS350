package edu.drexel.dpa34;

import edu.drexel.dpa34.questions.Response;
import org.json.simple.JSONObject;

public class Survey extends Answerable implements AsJSON {
    Survey(JSONObject object) throws FormatException {
        super(object);
    }

    Survey(String name) {
        super(name);
    }

    public double gradeResponses(Response[] responses) {
        return 0.0; // Ayy, lmao
    }

    protected boolean gradeable() {
        return false;
    }

    public Response[] collectResponse() {
        return new Response[0];
    }
}
