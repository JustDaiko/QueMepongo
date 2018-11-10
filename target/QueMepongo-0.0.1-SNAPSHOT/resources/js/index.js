$(document).ready(function(){
    
    //
    // Toggle settings panel
    //

    var settingsPanel = $(".settings-panel");
    var settingsWheel = $("#settings-wheel");

    settingsWheel.click(function(){
        if(settingsPanel.hasClass("off")){
            settingsPanel.animate({"margin-right": "0px"}, 400);
            settingsWheel.animate({"margin-right": "250px"}, 400);
            settingsPanel.removeClass("off");
        }else{
            settingsPanel.animate({"margin-right": "-250px"}, 400);
            settingsWheel.animate({"margin-right": "0px"}, 400);
            settingsPanel.addClass("off");
        }
    });

    //
    // Toggle save base settings btton
    //

    var saveSettingsButton = $("#save-settings-button");
    saveSettingsButton.removeAttr('disabled');
});