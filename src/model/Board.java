package model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.servlet.http.HttpSessionAttributeListener;

@Getter
@Setter
@NoArgsConstructor
public class Board implements HttpSessionAttributeListener {
    private int playerTurn;
    String board;


}
