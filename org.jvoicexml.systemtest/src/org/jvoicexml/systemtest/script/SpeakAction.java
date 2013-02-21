package org.jvoicexml.systemtest.script;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

import org.jvoicexml.systemtest.Answer;

@XmlRootElement(name = "speak")
public class SpeakAction extends Action {

    private static final String MARK = "'";

    @XmlAttribute(name = "words")
    String speakWords;

    @Override
    public Answer execute(String event) {
        return new Answer(speakWords);
    }

    String parseWord(String message, String startMark, String endMark) {
        int first = message.indexOf(startMark);
        if (first < 0) {
            return null;
        }
        int last = message.indexOf(endMark, first + endMark.length());
        if (last < 0) {
            return null;
        }
        return message.substring(first + 1, last);
    }

    public String getAnswer(final String message) {
        String answer = null;
        if (message.indexOf("Say") >= 0) {
            answer = parseWord(message, MARK, MARK);
        } else if (message.indexOf("Press") >= 0) {
            answer = parseWord(message, MARK, MARK);
        }
        return answer;
    }
}
