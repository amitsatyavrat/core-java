package com.javabhakt.core.designPrinciples.solid.lsp;

public class Facebook extends SocialMedia {

	//all are applicable for Facebook which means its substitutable by SocialMedia, so it follows LSP
	@Override
	public void chatWithFriend() {
		
	}

	@Override
	public void publishPost(Object post) {
		
	}

	@Override
	public void sendPhotosAndVideos() {
		
	}

	@Override
	public void groupVideoCall(String... users) {
		
	}

}
