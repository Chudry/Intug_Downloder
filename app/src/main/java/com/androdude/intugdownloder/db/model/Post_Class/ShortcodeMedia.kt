package com.androdude.intugdownloder.db.model

data class ShortcodeMedia(
    val __typename: String,
    val accessibility_caption: String,
    val caption_is_edited: Boolean,
    val commenting_disabled_for_viewer: Boolean,
    val comments_disabled: Boolean,
    val dimensions: Dimensions,
    val display_resources: List<DisplayResource>,
    val display_url: String,
    val edge_media_preview_comment: EdgeMediaPreviewComment,
    val edge_media_preview_like: EdgeMediaPreviewLike,
    val edge_media_to_caption: EdgeMediaToCaption,
    val edge_media_to_hoisted_comment: EdgeMediaToHoistedComment,
    val edge_media_to_parent_comment: EdgeMediaToParentComment,
    val edge_media_to_sponsor_user: EdgeMediaToSponsorUser,
    val edge_media_to_tagged_user: EdgeMediaToTaggedUser,
    val edge_related_profiles: EdgeRelatedProfiles,
    val edge_web_media_to_related_media: EdgeWebMediaToRelatedMedia,
    val fact_check_information: Any,
    val fact_check_overall_rating: Any,
    val gating_info: Any,
    val has_ranked_comments: Boolean,
    val id: String,
    val is_ad: Boolean,
    val is_video: Boolean,
    val video_url : String,
    val location: Any,
    val media_overlay_info: Any,
    val media_preview: String,
    val owner: OwnerXXX,
    val sensitivity_friction_info: Any,
    val shortcode: String,
    val taken_at_timestamp: Int,
    val tracking_token: String,
    val viewer_can_reshare: Boolean,
    val viewer_has_liked: Boolean,
    val viewer_has_saved: Boolean,
    val viewer_has_saved_to_collection: Boolean,
    val viewer_in_photo_of_you: Boolean
)