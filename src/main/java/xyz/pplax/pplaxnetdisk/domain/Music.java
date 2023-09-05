package xyz.pplax.pplaxnetdisk.domain;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import javax.validation.constraints.NotNull;

import java.io.Serializable;

import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.Length;

/**
* 
* @TableName music
*/
public class Music implements Serializable {

    /**
    * 
    */
    @NotNull(message="[]不能为空")
    @ApiModelProperty("")
    private Long musicid;
    /**
    * 
    */
    @Size(max= 255,message="编码长度不能超过255")
    @ApiModelProperty("")
    @Length(max= 255,message="编码长度不能超过255")
    private String album;
    /**
    * 
    */
    @Size(max= 255,message="编码长度不能超过255")
    @ApiModelProperty("")
    @Length(max= 255,message="编码长度不能超过255")
    private String albumartist;
    /**
    * 
    */
    @Size(max= 255,message="编码长度不能超过255")
    @ApiModelProperty("")
    @Length(max= 255,message="编码长度不能超过255")
    private String artist;
    /**
    * 
    */
    @Size(max= 255,message="编码长度不能超过255")
    @ApiModelProperty("")
    @Length(max= 255,message="编码长度不能超过255")
    private String comment;
    /**
    * 
    */
    @Size(max= 255,message="编码长度不能超过255")
    @ApiModelProperty("")
    @Length(max= 255,message="编码长度不能超过255")
    private String composer;
    /**
    * 
    */
    @Size(max= 255,message="编码长度不能超过255")
    @ApiModelProperty("")
    @Length(max= 255,message="编码长度不能超过255")
    private String copyright;
    /**
    * 
    */
    @Size(max= 255,message="编码长度不能超过255")
    @ApiModelProperty("")
    @Length(max= 255,message="编码长度不能超过255")
    private String encoder;
    /**
    * 文件id
    */
    @ApiModelProperty("文件id")
    private Long fileid;
    /**
    * 
    */
    @Size(max= 255,message="编码长度不能超过255")
    @ApiModelProperty("")
    @Length(max= 255,message="编码长度不能超过255")
    private String genre;
    /**
    * 歌词
    */
    @Size(max= 10000,message="编码长度不能超过10000")
    @ApiModelProperty("歌词")
    @Length(max= 10000,message="编码长度不能超过10,000")
    private String lyrics;
    /**
    * 
    */
    @Size(max= 255,message="编码长度不能超过255")
    @ApiModelProperty("")
    @Length(max= 255,message="编码长度不能超过255")
    private String originalartist;
    /**
    * 
    */
    @Size(max= 255,message="编码长度不能超过255")
    @ApiModelProperty("")
    @Length(max= 255,message="编码长度不能超过255")
    private String publicer;
    /**
    * 
    */
    @Size(max= 255,message="编码长度不能超过255")
    @ApiModelProperty("")
    @Length(max= 255,message="编码长度不能超过255")
    private String title;
    /**
    * 
    */
    @Size(max= 255,message="编码长度不能超过255")
    @ApiModelProperty("")
    @Length(max= 255,message="编码长度不能超过255")
    private String track;
    /**
    * 
    */
    @ApiModelProperty("")
    private Double tracklength;
    /**
    * 
    */
    @Size(max= 255,message="编码长度不能超过255")
    @ApiModelProperty("")
    @Length(max= 255,message="编码长度不能超过255")
    private String url;
    /**
    * 
    */
    @Size(max= 255,message="编码长度不能超过255")
    @ApiModelProperty("")
    @Length(max= 255,message="编码长度不能超过255")
    private String year;
    /**
    * 
    */
    @ApiModelProperty("")
    private byte[] albumimage;

    /**
    * 
    */
    private void setMusicid(Long musicid){
    this.musicid = musicid;
    }

    /**
    * 
    */
    private void setAlbum(String album){
    this.album = album;
    }

    /**
    * 
    */
    private void setAlbumartist(String albumartist){
    this.albumartist = albumartist;
    }

    /**
    * 
    */
    private void setArtist(String artist){
    this.artist = artist;
    }

    /**
    * 
    */
    private void setComment(String comment){
    this.comment = comment;
    }

    /**
    * 
    */
    private void setComposer(String composer){
    this.composer = composer;
    }

    /**
    * 
    */
    private void setCopyright(String copyright){
    this.copyright = copyright;
    }

    /**
    * 
    */
    private void setEncoder(String encoder){
    this.encoder = encoder;
    }

    /**
    * 文件id
    */
    private void setFileid(Long fileid){
    this.fileid = fileid;
    }

    /**
    * 
    */
    private void setGenre(String genre){
    this.genre = genre;
    }

    /**
    * 歌词
    */
    private void setLyrics(String lyrics){
    this.lyrics = lyrics;
    }

    /**
    * 
    */
    private void setOriginalartist(String originalartist){
    this.originalartist = originalartist;
    }

    /**
    * 
    */
    private void setPublicer(String publicer){
    this.publicer = publicer;
    }

    /**
    * 
    */
    private void setTitle(String title){
    this.title = title;
    }

    /**
    * 
    */
    private void setTrack(String track){
    this.track = track;
    }

    /**
    * 
    */
    private void setTracklength(Double tracklength){
    this.tracklength = tracklength;
    }

    /**
    * 
    */
    private void setUrl(String url){
    this.url = url;
    }

    /**
    * 
    */
    private void setYear(String year){
    this.year = year;
    }

    /**
    * 
    */
    private void setAlbumimage(byte[] albumimage){
    this.albumimage = albumimage;
    }


    /**
    * 
    */
    private Long getMusicid(){
    return this.musicid;
    }

    /**
    * 
    */
    private String getAlbum(){
    return this.album;
    }

    /**
    * 
    */
    private String getAlbumartist(){
    return this.albumartist;
    }

    /**
    * 
    */
    private String getArtist(){
    return this.artist;
    }

    /**
    * 
    */
    private String getComment(){
    return this.comment;
    }

    /**
    * 
    */
    private String getComposer(){
    return this.composer;
    }

    /**
    * 
    */
    private String getCopyright(){
    return this.copyright;
    }

    /**
    * 
    */
    private String getEncoder(){
    return this.encoder;
    }

    /**
    * 文件id
    */
    private Long getFileid(){
    return this.fileid;
    }

    /**
    * 
    */
    private String getGenre(){
    return this.genre;
    }

    /**
    * 歌词
    */
    private String getLyrics(){
    return this.lyrics;
    }

    /**
    * 
    */
    private String getOriginalartist(){
    return this.originalartist;
    }

    /**
    * 
    */
    private String getPublicer(){
    return this.publicer;
    }

    /**
    * 
    */
    private String getTitle(){
    return this.title;
    }

    /**
    * 
    */
    private String getTrack(){
    return this.track;
    }

    /**
    * 
    */
    private Double getTracklength(){
    return this.tracklength;
    }

    /**
    * 
    */
    private String getUrl(){
    return this.url;
    }

    /**
    * 
    */
    private String getYear(){
    return this.year;
    }

    /**
    * 
    */
    private byte[] getAlbumimage(){
    return this.albumimage;
    }

}
