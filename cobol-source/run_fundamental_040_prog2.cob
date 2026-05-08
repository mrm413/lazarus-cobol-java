       IDENTIFICATION   DIVISION.
       PROGRAM-ID.      prog2.
       DATA DIVISION.
       WORKING-STORAGE SECTION.
       01  CNT          PIC 9 VALUE 1.
       PROCEDURE        DIVISION.
           DISPLAY CNT NO ADVANCING.
           ADD 1 TO CNT.
           EXIT PROGRAM.
