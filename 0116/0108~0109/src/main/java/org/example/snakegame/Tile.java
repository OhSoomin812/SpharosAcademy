package org.example.snakegame;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Tile {

    private int num;
    private String desc;
    private String type;
    private int moving;

    public Tile(int num) {
        this.num = num;
    }
}

