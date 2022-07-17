package com.javabhakt.core.designPrinciples.solid.lsp;

public class Instagram extends SocialMedia{

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
		// Not applicable for Instagram which means not substitutable by SocialMedia and so violates LSP
		
	}

}
