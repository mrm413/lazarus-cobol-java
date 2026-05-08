IDENTIFICATION   DIVISION.
       PROGRAM-ID.      prog.
       DATA DIVISION.
       WORKING-STORAGE SECTION.
       PROCEDURE        DIVISION.
           CALL "prog2".
           CALL "prog2".
           CANCEL "prog2".
           CALL "prog2".
           CANCEL "prog2".
           DISPLAY "NG" NO ADVANCING.
           STOP RUN.
       END PROGRAM prog.

       IDENTIFICATION   DIVISION.
       PROGRAM-ID.      prog2.
       DATA DIVISION.
       WORKING-STORAGE SECTION.
       01  CNT          PIC 9 VALUE 1.
       PROCEDURE        DIVISION.
           DISPLAY CNT NO ADVANCING.
           ADD 1 TO CNT.
           EXIT PROGRAM.
       END PROGRAM prog2.
