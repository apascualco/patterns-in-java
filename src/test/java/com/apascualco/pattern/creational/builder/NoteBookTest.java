package com.apascualco.pattern.creational.builder;

import com.apascualco.pattern.creational.builder.constructor.Director;
import com.apascualco.pattern.creational.builder.constructor.NoteBookBuilder;
import com.apascualco.pattern.creational.builder.domain.NoteBook;
import com.apascualco.pattern.creational.builder.domain.Type;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NoteBookTest {

    @Test
    public void notebook_construct_pc_design() {
        final NoteBookBuilder noteBookBuilder= new NoteBookBuilder();

        Director.constructPCDesign(noteBookBuilder);
        final NoteBook design = noteBookBuilder.build();
        assertEquals(Type.PRO, design.getType());
        assertEquals("i7-7700K 4.2GHZ", design.getProcessor());
        assertEquals(128,design.getRam());
    }

    @Test
    public void notebook_construct_pc_gaming() {
        final NoteBookBuilder noteBookBuilder= new NoteBookBuilder();

        Director.constructPCDesign(noteBookBuilder);
        final NoteBook gaming = noteBookBuilder.build();
        assertEquals(Type.PRO, gaming.getType());
        assertEquals("i7-7700K 4.2GHZ", gaming.getProcessor());
        assertEquals(128, gaming.getRam());
    }

    @Test
    public void notebook_construct_pc_mobility() {
        final NoteBookBuilder noteBookBuilder= new NoteBookBuilder();

        Director.constructPCDesign(noteBookBuilder);
        final NoteBook mobility = noteBookBuilder.build();
        assertEquals(Type.PRO, mobility.getType());
        assertEquals("i7-7700K 4.2GHZ", mobility.getProcessor());
        assertEquals(128, mobility.getRam()) ;
    }

    @Test
    public void notebook_construct_pc_travel() {
        final NoteBookBuilder noteBookBuilder= new NoteBookBuilder();

        Director.constructPCDesign(noteBookBuilder);
        final NoteBook travel = noteBookBuilder.build();
        assertEquals(Type.PRO, travel.getType());
        assertEquals("i7-7700K 4.2GHZ", travel.getProcessor());
        assertEquals(128, travel.getRam());
    }

}
