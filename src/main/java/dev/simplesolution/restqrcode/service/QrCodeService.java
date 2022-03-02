package dev.simplesolution.restqrcode.service;

public interface QrCodeService {
    byte[] generateQrCode(String qrCodeContent, int width, int height);
}
