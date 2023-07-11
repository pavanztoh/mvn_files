package stedef;

import com.pages.logout_page;
import com.pages.playlist_page;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Create_playlist_steps {
	@Given("I click on playlist tab")
	public void i_click_on_playlist_tab() throws InterruptedException {
		playlist_page.playlistbtn_cLick();
	    
	}

	@Given("I click on Create playlist")
	public void i_click_on_create_playlist() throws Exception {
		playlist_page.ClickOnCreatePlaylist();
	}

	@When("I fill the name of the playlist with {string}")
	public void i_fill_the_name_of_the_playlist_with(String string) throws Exception {
		
		playlist_page.enterPlaylist(string);
		Thread.sleep(5000);
		playlist_page.create_playlist_btn_Click();
	}

	@When("I click on Library tab and add two lectures to the newly created playlist")
	public void i_click_on_library_tab_and_add_two_lectures_to_the_newly_created_playlist() throws Exception {
		playlist_page.Library_tab();
		Thread.sleep(5000);
		playlist_page.add_My_Playlist1();
		
		Thread.sleep(5000);
		playlist_page.checkBox_My_PlayList();
		
		Thread.sleep(5000);
		playlist_page.Submit_btn_MyPLaylist();
		Thread.sleep(5000);
		playlist_page.add_My_playlist2();
		Thread.sleep(5000);
		playlist_page.checkBox_My_PlayList();
		Thread.sleep(5000);
		playlist_page.Submit_btn_MyPLaylist();
	    
	}

	@When("navigate back to playlist tab")
	public void navigate_back_to_playlist_tab() throws InterruptedException {
		playlist_page.naviagte_playlist();
	}

	@When("click on play all icon of newly created playlist")
	public void click_on_play_all_icon_of_newly_created_playlist() throws InterruptedException {
		playlist_page.playlistbtn_cLick();
	}
	@Then("I logout")
	public void i_logout() throws Exception {
		logout_page.clickProfiledrpDown();
		Thread.sleep(5000);
		logout_page.LogoutBtn();
	}

}
