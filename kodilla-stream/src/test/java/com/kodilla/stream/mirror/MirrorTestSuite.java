package com.kodilla.stream.mirror;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MirrorTestSuite {
    @Test
    void mirrorTest(){
        //Given
        Mirror mirrorTest = new Mirror();
        String word1 = "Kajak";
        String word2 = "Ewa";
        String word3 = "Adam";
        String word4 = "Kirk Lazarus";
        //When
        String mirrorWord1 = mirrorTest.mirror(word1);
        String mirrorWord2 =mirrorTest.mirror(word2);
        String mirrorWord3 =mirrorTest.mirror(word3);
        String mirrorWord4 =mirrorTest.mirror(word4);
        //Then
        Assertions.assertEquals("kajaK",mirrorWord1);
        Assertions.assertEquals("awE",mirrorWord2);
        Assertions.assertEquals("madA",mirrorWord3);
        Assertions.assertEquals("surazaL kriK",mirrorWord4);



    }
}
