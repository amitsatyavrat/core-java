package com.javabhakt.core.designPrinciples.solid.lsp;

/*Liskov substitution principle states that inheritance should be 
 * applied in such a way that the derived classes must be substitutable
 * for their base classes. i.e. if class A is sub type of class B, then
 * we should be able to replace B with A without changing its behaviour*/
public abstract class SocialMedia {

	// Supported by Whatsapp, Facebook, Instagram
	public abstract void chatWithFriend();

	// Supported by Facebook, Instagram
	public abstract void publishPost(Object post);

	// Supported by Whatsapp, Facebook, Instagram
	public abstract void sendPhotosAndVideos();

	// Supported by Whatsapp, Facebook
	public abstract void groupVideoCall(String... users);

}
