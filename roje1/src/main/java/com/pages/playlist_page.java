package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class playlist_page {
	// x_paths
	public static final By playlists  = By.xpath("//div//a[text()='Playlists']");
	public static final By CreatePlaylistBtnBy = By.xpath("//a[@title='Create playlist']");
	public static final By searchBoxTextBy = By.xpath("//input[@id='txtPlaylistName']");
	public static final By create_By = By.xpath("//input[@value='CREATE']");
	
	
	public static final By library_tab_By=By.xpath("//span[normalize-space()='Library']");
	public static final By My_playlists_By = By.xpath("//a[@id='lnkMPCM']");
	
	public static final By Playlist1_By = By.xpath("//a[@id='container_2_rgLibrary_ctl00_ctl04_AddToPlaylistButton_hlModal']");
	public static final By playlist2_By = By.xpath("//a[@id='container_2_rgLibrary_ctl00_ctl06_AddToPlaylistButton_hlModal']");
	
	public static final By click_playlist_By =By.xpath("//input[@id='cb3436451']");
	public static final By submit_Playlist_By = By.xpath("//input[@id='submitbutmodal']");
	public static final By play_all_By = By.xpath("(//a[@id='3434745' and @title='Play all'])[2]");
	
	//web_Element
	
	public static WebElement playlistsbtn() {
		
		return Basepage.getDriver().findElement(playlists);
		
	}
	
	public static WebElement CreatePlaylistBtn()
	{
	
		return Basepage.getDriver().findElement(CreatePlaylistBtnBy);
	}
	
	static WebElement searchTextBox()
	{
	return Basepage.getDriver().findElement(searchBoxTextBy);
	}
	
	
	public static WebElement library_Tab() {
		return Basepage.getDriver().findElement (library_tab_By);

		}
	public static WebElement my_playlists_Lib() {
		return Basepage.getDriver().findElement(My_playlists_By);
	}
	public static WebElement  my_playlist1_add() {
		return Basepage.getDriver().findElement(Playlist1_By);
	}
	public static WebElement my_Playlist2_add() {
		return Basepage.getDriver().findElement(playlist2_By);
	}
	
	public static WebElement My_PlayList_CLick_() {
		return Basepage.getDriver().findElement(click_playlist_By);
	}
	
	public static WebElement Playlist_submitbtn_() {
		return Basepage.getDriver().findElement(submit_Playlist_By);
	}
	public static WebElement play_all_btn() {
		return Basepage.getDriver().findElement(play_all_By);
	}
	public static WebElement create_playlist() {
		return Basepage.getDriver().findElement(create_By);
	}
	
	
	
	//actions
	public static void playlistbtn_cLick() throws InterruptedException {
		Thread.sleep(5000);
		playlistsbtn().click();
	}
	
	public static void ClickOnCreatePlaylist() throws Exception
	{
	CreatePlaylistBtn().click();
	Thread.sleep(5000);
	}
	
	public static void enterPlaylist(String playlistName) throws Exception
	{
	Thread.sleep(5000);
	searchTextBox().sendKeys(playlistName);
	Thread.sleep(5000);
	}
	public static void create_playlist_btn_Click() throws InterruptedException {
		Thread.sleep(5000);
		create_playlist().click();
		
	}
	
	public static void Library_tab() throws Exception {
		Thread.sleep(3000);
		library_Tab().click();
		}
	public static void my_playLists_tab() throws InterruptedException {
		Thread.sleep(3000);
		my_playlists_Lib().click();
	}
	public static void add_My_Playlist1() throws InterruptedException {
		Thread.sleep(5000);
		my_playlist1_add().click();
	}
	public static void add_My_playlist2() throws InterruptedException {
		Thread.sleep(5000);
		my_Playlist2_add().click();
	}
	public static void checkBox_My_PlayList() throws InterruptedException {
		Thread.sleep(5000);
		My_PlayList_CLick_().click();
	}
	public static void Submit_btn_MyPLaylist() throws InterruptedException {
		Thread.sleep(5000);
		Playlist_submitbtn_().click();
		
		Thread.sleep(5000);
		
		
	}
	public static void naviagte_playlist() throws InterruptedException {
		Thread.sleep(5000);
		playlistsbtn().click();
	}
	public static void play_all_btn_Click() throws InterruptedException {
		Thread.sleep(5000);
		play_all_btn().click();
		
	}
}
