/*Δημιουργία πινάκων*/

CREATE TABLE MUSICGENRE (
    GENRE_ID BIGINT GENERATED BY DEFAULT AS IDENTITY,
    GENRE_NAME VARCHAR(45),
    PRIMARY KEY (GENRE_ID)
);

CREATE TABLE ARTIST (
    ARTIST_ID BIGINT GENERATED BY DEFAULT AS IDENTITY,
    FIRST_NAME VARCHAR(45),
    LAST_NAME VARCHAR(45),
    ARTISTIC_NAME VARCHAR(100) NOT NULL,
    SEX VARCHAR(45) NOT NULL,
    BIRTH_DAY TIMESTAMP NOT NULL,
    BIRTH_PLACE VARCHAR(45) NOT NULL,
    GENRE_ID BIGINT,
    MUSICGROUP_ID BIGINT,
    ALBUM_ID BIGINT,
    DISC_NUMBER INTEGER,
    PRIMARY KEY (ARTIST_ID)
);

CREATE TABLE MUSICGROUP (
    MUSICGROUP_ID BIGINT GENERATED BY DEFAULT AS IDENTITY,
    MUSICGROUP_NAME VARCHAR(100) NOT NULL,
    FORMATION_DATE TIMESTAMP NOT NULL,
    ARTIST_ID BIGINT,
    ALBUM_ID BIGINT,
    DISC_NUMBER INTEGER,
    PRIMARY KEY (MUSICGROUP_ID)
);

CREATE TABLE MUSICPRODUCTIONCOMPANY (
    MPC_ID BIGINT GENERATED BY DEFAULT AS IDENTITY,
    MPC_NAME VARCHAR(100) NOT NULL,
    ADDRESS VARCHAR(100) NOT NULL,
    TELEPHONE VARCHAR(15) NOT NULL,
    PRIMARY KEY (MPC_ID)
);

CREATE TABLE ALBUM (
    ALBUM_ID BIGINT NOT NULL,
    TITLE VARCHAR(255) NOT NULL,
    RELEASE_DATE TIMESTAMP NOT NULL,
    ALBUM_TYPE VARCHAR(45) NOT NULL,
    DISC_NUMBER INTEGER NOT NULL,
    MPC_ID BIGINT NOT NULL,
    MUSICGROUP_ID BIGINT,
    ARTIST_ID BIGINT,
    PRIMARY KEY (ALBUM_ID, DISC_NUMBER)
);

CREATE TABLE PLAYLIST (
    PLAYLIST_ID BIGINT GENERATED BY DEFAULT AS IDENTITY,
    PL_NAME VARCHAR(255) NOT NULL,
    PL_DESCRIPTION VARCHAR(255),
    PL_CREATION_DATE TIMESTAMP NOT NULL,
    SONG_ID BIGINT NOT NULL,
    PRIMARY KEY (PLAYLIST_ID)
);

CREATE TABLE SONG (
    SONG_ID BIGINT GENERATED BY DEFAULT AS IDENTITY,
    TITLE VARCHAR(255) NOT NULL,
    DURATION TIMESTAMP NOT NULL,
    TRACK_NR INTEGER NOT NULL,
    ALBUM_ID BIGINT NOT NULL,
    DISC_NUMBER INTEGER NOT NULL,
    PLAYLIST_ID BIGINT,
    PRIMARY KEY (SONG_ID)
);


/*Προσθήκη πεδίων (συγκεκριμένα foreign keys)*/
/*Η προσθήκη πεδίων στον εκάστοτε πίνακα μπορεί να γίνει με μία μόνο εντολή ALTER TABLE & ADD ανά πίνακα
(multiple columns), αλλά για κάποιο περίεργο λόγο το NetBeans δεν δέχεται την πολλαπλή προσθήκη πεδίων. 
Γι' αυτό παρακάτω γίνεται προσθήκη ενός πεδίου (και συγκεκριμένα η σύνδεση των foreign keys) κάθε φορά*/

ALTER TABLE ARTIST
    ADD CONSTRAINT MUSICGENRE_FK FOREIGN KEY (GENRE_ID)
            REFERENCES MUSICGENRE(GENRE_ID);

ALTER TABLE ARTIST
    ADD CONSTRAINT MUSICGROUP_FK FOREIGN KEY (MUSICGROUP_ID)
            REFERENCES MUSICGROUP(MUSICGROUP_ID);

ALTER TABLE ARTIST
    ADD CONSTRAINT ARTIST_ALBUM_FK FOREIGN KEY (ALBUM_ID, DISC_NUMBER)
            REFERENCES ALBUM(ALBUM_ID, DISC_NUMBER);

ALTER TABLE MUSICGROUP
    ADD CONSTRAINT ARTIST_FK FOREIGN KEY (ARTIST_ID)
            REFERENCES ARTIST(ARTIST_ID);

ALTER TABLE MUSICGROUP
    ADD CONSTRAINT GROUP_ALBUM_FK FOREIGN KEY (ALBUM_ID, DISC_NUMBER)
            REFERENCES ALBUM(ALBUM_ID, DISC_NUMBER);

ALTER TABLE ALBUM
    ADD CONSTRAINT MUSICPRODUCTIONCOMPANY_FK FOREIGN KEY (MPC_ID)
            REFERENCES MUSICPRODUCTIONCOMPANY(MPC_ID);

ALTER TABLE ALBUM
    ADD CONSTRAINT ALBUM_ARTIST_FK FOREIGN KEY (ARTIST_ID)
            REFERENCES ARTIST(ARTIST_ID);

ALTER TABLE ALBUM
    ADD CONSTRAINT ALBUM_MUSICGROUP_FK FOREIGN KEY (MUSICGROUP_ID)
            REFERENCES MUSICGROUP(MUSICGROUP_ID);

ALTER TABLE PLAYLIST
    ADD CONSTRAINT SONG_FK FOREIGN KEY (SONG_ID)
        REFERENCES SONG(SONG_ID);

ALTER TABLE SONG
    ADD CONSTRAINT SONG_ALBUM_FK FOREIGN KEY (ALBUM_ID, DISC_NUMBER)
            REFERENCES ALBUM(ALBUM_ID, DISC_NUMBER);
        
ALTER TABLE SONG
    ADD CONSTRAINT PLAYLIST_FK FOREIGN KEY (PLAYLIST_ID)
            REFERENCES PLAYLIST(PLAYLIST_ID);