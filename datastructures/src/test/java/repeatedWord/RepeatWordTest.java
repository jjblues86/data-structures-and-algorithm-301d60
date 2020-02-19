package repeatedWord;

import org.junit.Test;
import static org.junit.Assert.*;

public class RepeatWordTest {
    RepeatedWord repeatedWord;

    @Test public void repeatedWordIt(){
        String output1 = "It was the best of times, it was the worst of times, it was the age of wisdom, it was the age of foolishness, it was the epoch of belief, it was the epoch of incredulity, it was the season of Light, it was the season of Darkness, it was the spring of hope, it was the winter of despair, we had everything before us, we had nothing before us, we were all going direct to Heaven, we were all going direct the other way – in short, the period was so far like the present period, that some of its noisiest authorities insisted on its being received, for good or for evil, in the superlative degree of comparison only...";
        assertEquals("it", RepeatedWord.repeatedWord(output1));

    }
    @Test public void repeatedWordA(){
        String output = "Once upon a time, there was a brave princess who...";
        assertEquals("a", RepeatedWord.repeatedWord(output));

    }
    @Test public void repeatedWordSummer(){
        String output = "It was a queer, sultry summer, the summer they electrocuted the Rosenbergs, and I didn’t know what I was doing in New York...";
        assertEquals("summer", RepeatedWord.repeatedWord(output));
    }
    @Test public void nullString(){
        String output = "";
        assertEquals(null, RepeatedWord.repeatedWord(output));
    }
    @Test public void emptyString(){
        String output = "";
        assertTrue((String) RepeatedWord.repeatedWord(output), output.isEmpty());
    }
}
