package com.friendship41.web.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@ToString
@Table(name = "MUSICLIST_MUSIC")
@SequenceGenerator(
        name = "M_MUSIC_SEQUENCE_GEN",
        sequenceName = "M_MUSIC_SEQUENCE",
        initialValue = 1,
        allocationSize = 1
)
public class Music
{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "M_MUSIC_SEQUENCE_GEN")
    private Long mMusicSeq;

    private String mMemberId;
    private String mMusicName;
    private String mMusicArtist;
    private Long mSortSeq;
    private String mMusicComment;
    private Long mListSeq;
}
