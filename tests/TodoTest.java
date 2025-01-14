import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TodoTest {

    @Test
    void todoShouldBeSerializable(){
        Todo sut = new Todo("some text", false);
        Assertions.assertEquals("[ ]<some text>", sut.toString());
    }

    @Test
    void todoShouldBeSerializableWithDone(){
        Todo sut = new Todo("some text", true);
        Assertions.assertEquals("[X]<some text>", sut.toString());
    }
    @Test
    void todoShouldBeModifiable(){
        Todo sut = new Todo("some text", false);
        Assertions.assertEquals("[ ]<some text>", sut.toString());
        sut.toggle();
        Assertions.assertEquals("[X]<some text>", sut.toString());
        sut.toggle();
        Assertions.assertEquals("[ ]<some text>", sut.toString());
    }

    @Test
    void todoShouldBeDeserializable(){
        Todo sut = Todo.fromString("[ ]<some text>");
        assertEquals(sut.getText(), "some text");
        assertEquals(sut.isDone(),false);
    }
}