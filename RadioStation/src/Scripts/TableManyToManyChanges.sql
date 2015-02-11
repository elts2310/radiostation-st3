/*Για την διόρθωση των σχέσεων ManyToMany, που υπάρχει μεταξύ των
πινάκων ARTIST-MUSICGROUP και PLAYLIST-SONG έκανα τις εξής τροποποιήσεις:
(Ο κώδικας για την διαγραφή κλειδιών και πεδίων είναι περιττός,
απλά τον παραθέτω για να είναι πιο πλήρης η αναφορά)*/


/*Κατάργηση FK και ΠΕΔΙΩΝ*/

ALTER TABLE ARTIST
    DROP CONSTRAINT MUSICGROUP_FK;

ALTER TABLE MUSICGROUP
    DROP CONSTRAINT ARTIST_FK;

ALTER TABLE PLAYLIST
    DROP CONSTRAINT SONG_FK;

ALTER TABLE SONG
    DROP CONSTRAINT PLAYLIST_FK;

ALTER TABLE ARTIST
    DROP COLUMN MUSICGROUP_ID;

ALTER TABLE MUSICGROUP
    DROP COLUMN ARTIST_ID;

ALTER TABLE PLAYLIST
    DROP COLUMN SONG_ID;

ALTER TABLE SONG
    DROP COLUMN PLAYLIST_FK;


/*Δημιουργία ενδιάμεσων πινάκων και προσθήκη FK*/

CREATE TABLE MUSICGROUP_ARTISTS (
    ARTIST_ID BIGINT NOT NULL,
    MUSICGROUP_ID BIGINT NOT NULL,
    PRIMARY KEY (ARTIST_ID, MUSICGROUP_ID)
);


/*Στο ανάλογο πεδίο του παρακάτω πίνακα διατηρείται
η σειρά του τραγουδιού εντός της λίστας*/

CREATE TABLE PLAYLIST_SONGS (
    PLAYLIST_ID BIGINT NOT NULL,
    SONG_ID BIGINT NOT NULL,
    ORDER_NUMBER INTEGER NOT NULL,
    PRIMARY KEY (PLAYLIST_ID, SONG_ID)
);

ALTER TABLE MUSICGROUP_ARTISTS
    ADD CONSTRAINT ARTIST_FK FOREIGN KEY (ARTIST_ID)
    REFERENCES ARTIST(ARTIST_ID);

ALTER TABLE MUSICGROUP_ARTISTS
    ADD CONSTRAINT MUSICGROUP_FK FOREIGN KEY (MUSICGROUP_ID)
    REFERENCES MUSICGROUP(MUSICGROUP_ID);

ALTER TABLE PLAYLIST_SONGS
    ADD CONSTRAINT PLAYLIST_FK FOREIGN KEY (PLAYLIST_ID)
    REFERENCES PLAYLIST(PLAYLIST_ID);

ALTER TABLE PLAYLIST_SONGS
    ADD CONSTRAINT SONG_FK FOREIGN KEY (SONG_ID)
    REFERENCES SONG(SONG_ID);



