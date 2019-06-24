function init() {
    $(document).ready(function() {
        Chat.init({
                connect_message: 'Do you have questions ? <br>Come chat with us, we are here to help you',
                loading_message: 'Thank you for using our chat <br>Please wait a moment...',
                loader_sub_header: 'Connecting...',
                login_sub_header: 'Please tell us about yourself',
                chat_sub_header: 'Our Assistant is ready for you',
                url: 'https://driver.3dolphins.ai:31418',
                client_id: 'f181392d7b4f13ec1903d6359edf0cf2',
                client_secret: '0a105a36837fd92504c9b9a1ad8d36a5',
                type_placeholder: 'Type message...',
                avatar: 'https://www.inmotion.co.id/assets/images/logo/sri_face.png',
                agent_avatar: 'https://www.inmotion.co.id/assets/images/logo/sri_face.png',
                header: 'Welcome to 3Dolphins Live Chat',
    triggerMenu: 'Main Menu',
    enable_voice: false,
    queue_text: '⏰ Queue Number: ',
    enable_queue: true,
    errorLocationMessage: 'Mohon aktifkan setelan lokasi pada browser anda. Silakan klik disini untuk melihat cara aktifasinya ya: <a href="https://support.apple.com/en-us/HT204690" target="_blank">Safari</a>, <a href="https://support.microsoft.com/en-us/help/17479/windows-internet-explorer-11-change-security-privacy-settings" target="_blank">IE</a>, <a href="https://support.mozilla.org/en-US/kb/does-firefox-share-my-location-websites" target="_blank">Mozilla Firefox</a>, <a href="https://support.google.com/chrome/answer/114662" target="_blank">Chrome</a>, <a href="https://support.microsoft.com/en-us/help/4468240/windows-10-location-service-and-privacy-microsoft-privacy" target="_blank">Microsoft Edge</a>,  <a href="https://help.opera.com/en/geolocation/" target="_blank">Opera</a>'
  });
})
}
init();
