package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    Character[][] matrix;

    public Board(Character[][] matrix) {
        this.matrix=matrix;
    }

    public Boolean isInFavorOfX() {
        if( getWinner().equals("O")|| (isTie())){
            return false;
        } else if (getWinner().equals("X")|| (isTie())){
            return true;

        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                    if ((matrix[0][0] == 'X') && (matrix[0][1] == 'X')) {
                        return true;
                    } else if ((matrix[0][1] == 'X') && (matrix[0][2] == 'X')) {
                        return true;
                    } else if ((matrix[1][0] == 'X') && (matrix[1][1] == 'X')) {
                        return true;
                    } else if ((matrix[1][1] == 'X') && (matrix[1][2] == 'X')) {
                        return true;
                    } else if ((matrix[0][0] == 'X') && (matrix[1][0] == 'X')) {
                        return true;
                    } else if ((matrix[0][1] == 'X') && (matrix[1][1] == 'X')) {
                        return true;
                    } else if ((matrix[0][2] == 'X') && (matrix[1][2] == 'X')) {
                        return true;
                    } else if ((matrix[2][0] == 'X') && (matrix[2][1] == 'X')) {
                        return true;
                    } else if ((matrix[2][1] == 'X') && (matrix[2][2] == 'X')) {
                        return true;
                    } else if ((matrix[1][0] == 'X') && (matrix[2][0] == 'X')) {
                        return true;
                    } else if ((matrix[1][1] == 'X') && (matrix[2][1] == 'X')) {
                        return true;
                    } else if ((matrix[1][2] == 'X') && (matrix[2][2] == 'X')) {
                        return true;

                }
            }

        }
        return false;
    }

    public Boolean isInFavorOfO() {
        if( getWinner().equals("X")||(isTie())){
            return false;
        } else if (getWinner().equals("O")|| (isTie())){
            return true;

        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                if ((matrix[0][0] == 'O') && (matrix[0][1] == 'O')) {
                    return true;
                } else if ((matrix[0][1] == 'O') && (matrix[0][2] == 'O')) {
                    return true;
                } else if ((matrix[1][0] == 'O') && (matrix[1][1] == 'O')) {
                    return true;
                } else if ((matrix[1][1] == 'O') && (matrix[1][2] == 'O')) {
                    return true;
                } else if ((matrix[0][0] == 'O') && (matrix[1][0] == 'O')) {
                    return true;
                } else if ((matrix[0][1] == 'O') && (matrix[1][1] == 'O')) {
                    return true;
                } else if ((matrix[0][2] == 'O') && (matrix[1][2] == 'O')) {
                    return true;
                } else if ((matrix[2][0] == 'O') && (matrix[2][1] == 'O')) {
                    return true;
                } else if ((matrix[2][1] == 'O') && (matrix[2][2] == 'O')) {
                    return true;
                } else if ((matrix[1][0] == 'O') && (matrix[2][0] == 'O')) {
                    return true;
                } else if ((matrix[1][1] == 'O') && (matrix[2][1] == 'O')) {
                    return true;
                } else if ((matrix[1][2] == 'O') && (matrix[2][2] == 'O')) {
                    return true;

                }
            }

        }
        return false;
    }


    public Boolean isTie() {
        if (getWinner()==("")){
            return true;
        } else
        return false;
    }

    public String getWinner() {

        for (int i=0; i<matrix.length;i++){
            for (int j=0; j<matrix[i].length;j++) {
                if ((matrix[0][0] == 'X') && (matrix[0][1] == 'X') && (matrix[0][2] == 'X')) {
                    return String.valueOf('X');
                } else if ((matrix[0][0] == 'O') && (matrix[0][1] == 'O') && (matrix[0][1] == 'O')) {
                    return String.valueOf('O');
                } else if ((matrix[0][0] == 'O') && (matrix[1][1] == 'O') && (matrix[2][2] == 'O')) {
                    return String.valueOf('O');
                } else if ((matrix[0][0] == 'X') && (matrix[1][1] == 'X') && (matrix[2][2] == 'X')) {
                    return String.valueOf('X');
                }else if ((matrix[0][0] == 'X') && (matrix[1][0] == 'X') && (matrix[2][0] == 'X')) {
                    return String.valueOf('X');
                }else if ((matrix[0][0] == 'O') && (matrix[1][0] == 'O') && (matrix[2][0] == 'O')) {
                    return String.valueOf('O');
                }else if ((matrix[0][1] == 'O') && (matrix[1][1] == 'O') && (matrix[2][1] == 'O')) {
                    return String.valueOf('O');
                }else if ((matrix[0][1] == 'X') && (matrix[1][1] == 'X') && (matrix[2][1] == 'X')) {
                    return String.valueOf('X');
                }else if ((matrix[0][2] == 'O') && (matrix[1][2] == 'O') && (matrix[2][2] == 'O')) {
                    return String.valueOf('O');
                }else if ((matrix[0][2] == 'X') && (matrix[1][2] == 'X') && (matrix[2][2] == 'X')) {
                    return String.valueOf('X');
                }else if ((matrix[1][0] == 'O') && (matrix[1][1] == 'O') && (matrix[1][2] == 'O')) {
                    return String.valueOf('O');
                }else if ((matrix[1][0] == 'X') && (matrix[1][1] == 'X') && (matrix[1][2] == 'X')) {
                    return String.valueOf('X');
                }else if ((matrix[2][0] == 'X') && (matrix[2][1] == 'X') && (matrix[2][2] == 'X')) {
                    return String.valueOf('X');
                }else if ((matrix[2][0] == 'O') && (matrix[2][1] == 'O') && (matrix[2][2] == 'O')) {
                    return String.valueOf('O');
                }else if ((matrix[0][2] == 'O') && (matrix[1][1] == 'O') && (matrix[2][0] == 'O')) {
                    return String.valueOf('O');
                }else if ((matrix[0][2] == 'X') && (matrix[1][1] == 'X') && (matrix[2][0] == 'X')) {
                    return String.valueOf('X');
                }




            }
        }
        return "";
    }

}
