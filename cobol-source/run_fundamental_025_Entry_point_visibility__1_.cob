IDENTIFICATION   DIVISION.
       PROGRAM-ID.      prog.
       DATA DIVISION.
       PROCEDURE        DIVISION.
           CALL 'module'
           CALL 'modulepart'
           STOP RUN.
       END PROGRAM prog.

       IDENTIFICATION   DIVISION.
       PROGRAM-ID.      module.
       DATA DIVISION.
       PROCEDURE        DIVISION.
           DISPLAY "A" NO ADVANCING.
           EXIT PROGRAM.
       ENTRY "modulepart".
           DISPLAY "B" NO ADVANCING.
           EXIT PROGRAM.
       END PROGRAM module.
