package com.javabhakt.core.designPrinciples.solid.lsp;

public class Whatsapp extends SocialMedia {

	@Override
	public void chatWithFriend() {
		
	}

	@Override
	public void publishPost(Object post) {
		// Not applicable for Whatsapp which means its not substitutable by SocailMedia, so violates LSP
		
	}

	@Override
	public void sendPhotosAndVideos() {
		
	}

	@Override
	public void groupVideoCall(String... users) {
		
	}

}
