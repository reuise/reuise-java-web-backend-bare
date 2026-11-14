package dev.reuise.web.backend.bare;
import dev.reuise.core.RootComponent;
import dev.reuise.core.accordion.CoreAccordionItemOptions;
import dev.reuise.core.accordion.CoreAccordionOptions;
import dev.reuise.core.applayout.CoreAppLayoutBodyOptions;
import dev.reuise.core.applayout.CoreAppLayoutOptions;
import dev.reuise.core.avatar.CoreAvatarOptions;
import dev.reuise.core.badge.CoreBadgeOptions;
import dev.reuise.core.banner.CoreBannerOptions;
import dev.reuise.core.basecomponent.CoreBaseComponentPartOptions;
import dev.reuise.core.bottomappbar.CoreBottomAppBarOptions;
import dev.reuise.core.button.CoreButtonBarOptions;
import dev.reuise.core.button.CoreButtonOptions;
import dev.reuise.core.button.CoreIconButtonOptions;
import dev.reuise.core.card.CoreCardGridOptions;
import dev.reuise.core.card.CoreCardOptions;
import dev.reuise.core.carousel.CoreCarouselCardOptions;
import dev.reuise.core.carousel.CoreCarouselOptions;
import dev.reuise.core.chat.CoreChatBoxOptions;
import dev.reuise.core.checkbox.CoreBasicCheckboxOptions;
import dev.reuise.core.checkbox.CoreCheckboxOptions;
import dev.reuise.core.chip.CoreChipGroupOptions;
import dev.reuise.core.chip.CoreChipOptions;
import dev.reuise.core.chip.CoreFilterChipOptions;
import dev.reuise.core.consent.CoreConsentBannerOptions;
import dev.reuise.core.currencyselector.CoreCurrencySelectorOptions;
import dev.reuise.core.dialog.CoreDialogOptions;
import dev.reuise.core.dialog.CoreMessageDialogOptions;
import dev.reuise.core.divider.CoreDividerOptions;
import dev.reuise.core.drawer.CoreDrawerOptions;
import dev.reuise.core.dropzone.CoreDropZoneOptions;
import dev.reuise.core.floating.CoreFloatingActionButtonOptions;
import dev.reuise.core.floating.CoreFloatingPanelOptions;
import dev.reuise.core.icon.CoreIconOptions;
import dev.reuise.core.image.CoreImageOptions;
import dev.reuise.core.input.CoreBasicInputFieldOptions;
import dev.reuise.core.input.CoreChipFieldOptions;
import dev.reuise.core.input.CoreMultiEmailAddressFieldOptions;
import dev.reuise.core.input.CorePasswordFieldOptions;
import dev.reuise.core.input.CoreSearchFieldOptions;
import dev.reuise.core.input.CoreSegmentedTextFieldOptions;
import dev.reuise.core.input.CoreTextFieldOptions;
import dev.reuise.core.layout.CoreColumnLayoutOptions;
import dev.reuise.core.layout.CoreContainerOptions;
import dev.reuise.core.layout.CoreFieldSetOptions;
import dev.reuise.core.layout.CoreFlexContainerOptions;
import dev.reuise.core.layout.CoreRowLayoutOptions;
import dev.reuise.core.layout.CoreSheetLayoutOptions;
import dev.reuise.core.layout.CoreSurfaceOptions;
import dev.reuise.core.link.CoreLinkOptions;
import dev.reuise.core.link.CoreNavigationLinkOptions;
import dev.reuise.core.list.CoreBasicListItemOptions;
import dev.reuise.core.list.CoreBasicListOptions;
import dev.reuise.core.list.CoreListItemOptions;
import dev.reuise.core.list.CoreListViewOptions;
import dev.reuise.core.media.CoreAudioPlayerOptions;
import dev.reuise.core.media.CoreMediaPlayerOptions;
import dev.reuise.core.media.CoreTextTrackOptions;
import dev.reuise.core.media.CoreVideoPlayerOptions;
import dev.reuise.core.menu.CoreMenuButtonItemOptions;
import dev.reuise.core.menu.CoreMenuButtonOptions;
import dev.reuise.core.menu.CoreMenuDividerOptions;
import dev.reuise.core.menu.CoreMenuItemOptions;
import dev.reuise.core.menu.CoreMenuOptions;
import dev.reuise.core.navigation.CoreNavigationTreeGroupOptions;
import dev.reuise.core.navigation.CoreNavigationTreeLinkOptions;
import dev.reuise.core.navigation.CoreNavigationTreeOptions;
import dev.reuise.core.parentcomponent.CoreParentComponentPartOptions;
import dev.reuise.core.progressindicator.CoreProgressIndicatorOptions;
import dev.reuise.core.regionselector.CoreRegionSelectorOptions;
import dev.reuise.core.scrollablecontainer.CoreScrollableContainerEdgeOptions;
import dev.reuise.core.scrollablecontainer.CoreScrollableContainerOptions;
import dev.reuise.core.scrollablecontainer.CoreScrollableContainerScrollAreaOptions;
import dev.reuise.core.selectmenu.CoreSelectMenuOptions;
import dev.reuise.core.skeleton.CoreSkeletonOptions;
import dev.reuise.core.slidecontainer.CoreSlideContainerEdgeOptions;
import dev.reuise.core.slidecontainer.CoreSlideContainerOptions;
import dev.reuise.core.splitcontainer.CoreSplitContainerDividerOptions;
import dev.reuise.core.splitcontainer.CoreSplitContainerOptions;
import dev.reuise.core.splitcontainer.CoreSplitContainerPanelOptions;
import dev.reuise.core.table.CoreCheckboxTableCellOptions;
import dev.reuise.core.table.CoreCheckboxTableColumnOptions;
import dev.reuise.core.table.CoreTableBodyOptions;
import dev.reuise.core.table.CoreTableCellOptions;
import dev.reuise.core.table.CoreTableColumnGroupOptions;
import dev.reuise.core.table.CoreTableColumnOptions;
import dev.reuise.core.table.CoreTableFooterOptions;
import dev.reuise.core.table.CoreTableHeaderCellOptions;
import dev.reuise.core.table.CoreTableHeaderOptions;
import dev.reuise.core.table.CoreTableHeaderRowOptions;
import dev.reuise.core.table.CoreTableOptions;
import dev.reuise.core.table.CoreTableRowOptions;
import dev.reuise.core.tabs.CoreTabBarOptions;
import dev.reuise.core.tabs.CoreTabOptions;
import dev.reuise.core.text.CoreHeadingOptions;
import dev.reuise.core.text.CoreIconLabelOptions;
import dev.reuise.core.text.CoreInlineTextOptions;
import dev.reuise.core.text.CoreLabelOptions;
import dev.reuise.core.text.CoreLineBreakOptions;
import dev.reuise.core.text.CoreParagraphOptions;
import dev.reuise.core.text.CoreRotatingTextOptions;
import dev.reuise.core.text.CoreTextBlockOptions;
import dev.reuise.core.text.CoreTextOptions;
import dev.reuise.core.topappbar.CoreTopAppBarOptions;
import dev.reuise.core.view.CoreSheetViewOptions;
import dev.reuise.core.view.CoreViewOptions;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.accordion.WebBackendAccordion;
import dev.reuise.web.backend.accordion.WebBackendAccordionItem;
import dev.reuise.web.backend.accordion.WebBackendAccordionItemOptions;
import dev.reuise.web.backend.accordion.WebBackendAccordionOptions;
import dev.reuise.web.backend.applayout.WebBackendAppLayout;
import dev.reuise.web.backend.applayout.WebBackendAppLayoutBody;
import dev.reuise.web.backend.applayout.WebBackendAppLayoutBodyOptions;
import dev.reuise.web.backend.applayout.WebBackendAppLayoutOptions;
import dev.reuise.web.backend.avatar.WebBackendAvatar;
import dev.reuise.web.backend.avatar.WebBackendAvatarOptions;
import dev.reuise.web.backend.badge.WebBackendBadge;
import dev.reuise.web.backend.badge.WebBackendBadgeOptions;
import dev.reuise.web.backend.banner.WebBackendBanner;
import dev.reuise.web.backend.banner.WebBackendBannerOptions;
import dev.reuise.web.backend.bare.accordion.Accordion;
import dev.reuise.web.backend.bare.accordion.AccordionItem;
import dev.reuise.web.backend.bare.accordion.AccordionItemOptions;
import dev.reuise.web.backend.bare.accordion.AccordionOptions;
import dev.reuise.web.backend.bare.applayout.AppLayout;
import dev.reuise.web.backend.bare.applayout.AppLayoutBody;
import dev.reuise.web.backend.bare.applayout.AppLayoutBodyOptions;
import dev.reuise.web.backend.bare.applayout.AppLayoutOptions;
import dev.reuise.web.backend.bare.avatar.Avatar;
import dev.reuise.web.backend.bare.avatar.AvatarOptions;
import dev.reuise.web.backend.bare.badge.Badge;
import dev.reuise.web.backend.bare.badge.BadgeOptions;
import dev.reuise.web.backend.bare.banner.Banner;
import dev.reuise.web.backend.bare.banner.BannerOptions;
import dev.reuise.web.backend.bare.basecomponent.BaseComponent;
import dev.reuise.web.backend.bare.basecomponent.BaseComponentOptions;
import dev.reuise.web.backend.bare.bottomappbar.BottomAppBar;
import dev.reuise.web.backend.bare.bottomappbar.BottomAppBarOptions;
import dev.reuise.web.backend.bare.button.Button;
import dev.reuise.web.backend.bare.button.ButtonBar;
import dev.reuise.web.backend.bare.button.ButtonBarOptions;
import dev.reuise.web.backend.bare.button.ButtonOptions;
import dev.reuise.web.backend.bare.button.IconButton;
import dev.reuise.web.backend.bare.button.IconButtonOptions;
import dev.reuise.web.backend.bare.card.Card;
import dev.reuise.web.backend.bare.card.CardGrid;
import dev.reuise.web.backend.bare.card.CardGridOptions;
import dev.reuise.web.backend.bare.card.CardOptions;
import dev.reuise.web.backend.bare.carousel.Carousel;
import dev.reuise.web.backend.bare.carousel.CarouselCard;
import dev.reuise.web.backend.bare.carousel.CarouselCardOptions;
import dev.reuise.web.backend.bare.carousel.CarouselOptions;
import dev.reuise.web.backend.bare.chat.ChatBox;
import dev.reuise.web.backend.bare.chat.ChatBoxOptions;
import dev.reuise.web.backend.bare.checkbox.BasicCheckbox;
import dev.reuise.web.backend.bare.checkbox.BasicCheckboxOptions;
import dev.reuise.web.backend.bare.checkbox.Checkbox;
import dev.reuise.web.backend.bare.checkbox.CheckboxOptions;
import dev.reuise.web.backend.bare.chip.Chip;
import dev.reuise.web.backend.bare.chip.ChipGroup;
import dev.reuise.web.backend.bare.chip.ChipGroupOptions;
import dev.reuise.web.backend.bare.chip.ChipOptions;
import dev.reuise.web.backend.bare.chip.FilterChip;
import dev.reuise.web.backend.bare.chip.FilterChipOptions;
import dev.reuise.web.backend.bare.consent.ConsentBanner;
import dev.reuise.web.backend.bare.consent.ConsentBannerOptions;
import dev.reuise.web.backend.bare.currencyselector.CurrencySelector;
import dev.reuise.web.backend.bare.currencyselector.CurrencySelectorOptions;
import dev.reuise.web.backend.bare.dialog.Dialog;
import dev.reuise.web.backend.bare.dialog.DialogOptions;
import dev.reuise.web.backend.bare.dialog.MessageDialog;
import dev.reuise.web.backend.bare.dialog.MessageDialogOptions;
import dev.reuise.web.backend.bare.divider.Divider;
import dev.reuise.web.backend.bare.divider.DividerOptions;
import dev.reuise.web.backend.bare.document.Document;
import dev.reuise.web.backend.bare.document.DocumentBody;
import dev.reuise.web.backend.bare.document.DocumentBodyOptions;
import dev.reuise.web.backend.bare.document.DocumentOptions;
import dev.reuise.web.backend.bare.drawer.Drawer;
import dev.reuise.web.backend.bare.drawer.DrawerOptions;
import dev.reuise.web.backend.bare.dropzone.DropZone;
import dev.reuise.web.backend.bare.dropzone.DropZoneOptions;
import dev.reuise.web.backend.bare.filepicker.FilePicker;
import dev.reuise.web.backend.bare.filepicker.FilePickerOptions;
import dev.reuise.web.backend.bare.floating.FloatingActionButton;
import dev.reuise.web.backend.bare.floating.FloatingActionButtonOptions;
import dev.reuise.web.backend.bare.floating.FloatingPanel;
import dev.reuise.web.backend.bare.floating.FloatingPanelOptions;
import dev.reuise.web.backend.bare.graphics.svg.Svg;
import dev.reuise.web.backend.bare.graphics.svg.SvgGroup;
import dev.reuise.web.backend.bare.graphics.svg.SvgGroupOptions;
import dev.reuise.web.backend.bare.graphics.svg.SvgImage;
import dev.reuise.web.backend.bare.graphics.svg.SvgImageOptions;
import dev.reuise.web.backend.bare.graphics.svg.SvgOptions;
import dev.reuise.web.backend.bare.graphics.svg.SvgPath;
import dev.reuise.web.backend.bare.graphics.svg.SvgPathOptions;
import dev.reuise.web.backend.bare.graphics.svg.SvgRect;
import dev.reuise.web.backend.bare.graphics.svg.SvgRectOptions;
import dev.reuise.web.backend.bare.graphics.svg.SvgShape;
import dev.reuise.web.backend.bare.graphics.svg.SvgShapeOptions;
import dev.reuise.web.backend.bare.graphics.svg.SvgText;
import dev.reuise.web.backend.bare.graphics.svg.SvgTextOptions;
import dev.reuise.web.backend.bare.icon.Icon;
import dev.reuise.web.backend.bare.icon.IconOptions;
import dev.reuise.web.backend.bare.image.Image;
import dev.reuise.web.backend.bare.image.ImageOptions;
import dev.reuise.web.backend.bare.input.BasicInputField;
import dev.reuise.web.backend.bare.input.BasicInputFieldOptions;
import dev.reuise.web.backend.bare.input.ChipField;
import dev.reuise.web.backend.bare.input.ChipFieldOptions;
import dev.reuise.web.backend.bare.input.MultiEmailAddressField;
import dev.reuise.web.backend.bare.input.MultiEmailAddressFieldOptions;
import dev.reuise.web.backend.bare.input.PasswordField;
import dev.reuise.web.backend.bare.input.PasswordFieldOptions;
import dev.reuise.web.backend.bare.input.SearchField;
import dev.reuise.web.backend.bare.input.SearchFieldOptions;
import dev.reuise.web.backend.bare.input.SegmentedTextField;
import dev.reuise.web.backend.bare.input.SegmentedTextFieldOptions;
import dev.reuise.web.backend.bare.input.TextField;
import dev.reuise.web.backend.bare.input.TextFieldOptions;
import dev.reuise.web.backend.bare.layout.ColumnLayout;
import dev.reuise.web.backend.bare.layout.ColumnLayoutOptions;
import dev.reuise.web.backend.bare.layout.Container;
import dev.reuise.web.backend.bare.layout.ContainerOptions;
import dev.reuise.web.backend.bare.layout.FieldSet;
import dev.reuise.web.backend.bare.layout.FieldSetOptions;
import dev.reuise.web.backend.bare.layout.FlexContainer;
import dev.reuise.web.backend.bare.layout.FlexContainerOptions;
import dev.reuise.web.backend.bare.layout.RowLayout;
import dev.reuise.web.backend.bare.layout.RowLayoutOptions;
import dev.reuise.web.backend.bare.layout.SheetLayout;
import dev.reuise.web.backend.bare.layout.SheetLayoutOptions;
import dev.reuise.web.backend.bare.layout.Surface;
import dev.reuise.web.backend.bare.layout.SurfaceOptions;
import dev.reuise.web.backend.bare.link.Link;
import dev.reuise.web.backend.bare.link.LinkOptions;
import dev.reuise.web.backend.bare.link.NavigationLink;
import dev.reuise.web.backend.bare.link.NavigationLinkOptions;
import dev.reuise.web.backend.bare.list.BasicList;
import dev.reuise.web.backend.bare.list.BasicListItem;
import dev.reuise.web.backend.bare.list.BasicListItemOptions;
import dev.reuise.web.backend.bare.list.BasicListOptions;
import dev.reuise.web.backend.bare.list.ListItem;
import dev.reuise.web.backend.bare.list.ListItemOptions;
import dev.reuise.web.backend.bare.list.ListView;
import dev.reuise.web.backend.bare.list.ListViewOptions;
import dev.reuise.web.backend.bare.media.AudioPlayer;
import dev.reuise.web.backend.bare.media.AudioPlayerOptions;
import dev.reuise.web.backend.bare.media.MediaPlayer;
import dev.reuise.web.backend.bare.media.MediaPlayerOptions;
import dev.reuise.web.backend.bare.media.TextTrack;
import dev.reuise.web.backend.bare.media.TextTrackOptions;
import dev.reuise.web.backend.bare.media.VideoPlayer;
import dev.reuise.web.backend.bare.media.VideoPlayerOptions;
import dev.reuise.web.backend.bare.menu.Menu;
import dev.reuise.web.backend.bare.menu.MenuButton;
import dev.reuise.web.backend.bare.menu.MenuButtonItem;
import dev.reuise.web.backend.bare.menu.MenuButtonItemOptions;
import dev.reuise.web.backend.bare.menu.MenuButtonOptions;
import dev.reuise.web.backend.bare.menu.MenuDivider;
import dev.reuise.web.backend.bare.menu.MenuDividerOptions;
import dev.reuise.web.backend.bare.menu.MenuItem;
import dev.reuise.web.backend.bare.menu.MenuItemOptions;
import dev.reuise.web.backend.bare.menu.MenuOptions;
import dev.reuise.web.backend.bare.navigation.NavigationTree;
import dev.reuise.web.backend.bare.navigation.NavigationTreeGroup;
import dev.reuise.web.backend.bare.navigation.NavigationTreeGroupOptions;
import dev.reuise.web.backend.bare.navigation.NavigationTreeLink;
import dev.reuise.web.backend.bare.navigation.NavigationTreeLinkOptions;
import dev.reuise.web.backend.bare.navigation.NavigationTreeOptions;
import dev.reuise.web.backend.bare.parentcomponent.ParentComponent;
import dev.reuise.web.backend.bare.parentcomponent.ParentComponentOptions;
import dev.reuise.web.backend.bare.progressindicator.ProgressIndicator;
import dev.reuise.web.backend.bare.progressindicator.ProgressIndicatorOptions;
import dev.reuise.web.backend.bare.regionselector.RegionSelector;
import dev.reuise.web.backend.bare.regionselector.RegionSelectorOptions;
import dev.reuise.web.backend.bare.scriptcomponent.ScriptComponent;
import dev.reuise.web.backend.bare.scriptcomponent.ScriptComponentOptions;
import dev.reuise.web.backend.bare.scrollablecontainer.ScrollableContainer;
import dev.reuise.web.backend.bare.scrollablecontainer.ScrollableContainerEdge;
import dev.reuise.web.backend.bare.scrollablecontainer.ScrollableContainerEdgeOptions;
import dev.reuise.web.backend.bare.scrollablecontainer.ScrollableContainerOptions;
import dev.reuise.web.backend.bare.scrollablecontainer.ScrollableContainerScrollArea;
import dev.reuise.web.backend.bare.scrollablecontainer.ScrollableContainerScrollAreaOptions;
import dev.reuise.web.backend.bare.selectmenu.SelectMenu;
import dev.reuise.web.backend.bare.selectmenu.SelectMenuOptions;
import dev.reuise.web.backend.bare.skeleton.Skeleton;
import dev.reuise.web.backend.bare.skeleton.SkeletonOptions;
import dev.reuise.web.backend.bare.slidecontainer.SlideContainer;
import dev.reuise.web.backend.bare.slidecontainer.SlideContainerEdge;
import dev.reuise.web.backend.bare.slidecontainer.SlideContainerEdgeOptions;
import dev.reuise.web.backend.bare.slidecontainer.SlideContainerOptions;
import dev.reuise.web.backend.bare.splitcontainer.SplitContainer;
import dev.reuise.web.backend.bare.splitcontainer.SplitContainerDivider;
import dev.reuise.web.backend.bare.splitcontainer.SplitContainerDividerOptions;
import dev.reuise.web.backend.bare.splitcontainer.SplitContainerOptions;
import dev.reuise.web.backend.bare.splitcontainer.SplitContainerPanel;
import dev.reuise.web.backend.bare.splitcontainer.SplitContainerPanelOptions;
import dev.reuise.web.backend.bare.table.CheckboxTableCell;
import dev.reuise.web.backend.bare.table.CheckboxTableCellOptions;
import dev.reuise.web.backend.bare.table.CheckboxTableColumn;
import dev.reuise.web.backend.bare.table.CheckboxTableColumnOptions;
import dev.reuise.web.backend.bare.table.Table;
import dev.reuise.web.backend.bare.table.TableBody;
import dev.reuise.web.backend.bare.table.TableBodyOptions;
import dev.reuise.web.backend.bare.table.TableCell;
import dev.reuise.web.backend.bare.table.TableCellOptions;
import dev.reuise.web.backend.bare.table.TableColumn;
import dev.reuise.web.backend.bare.table.TableColumnGroup;
import dev.reuise.web.backend.bare.table.TableColumnGroupOptions;
import dev.reuise.web.backend.bare.table.TableColumnOptions;
import dev.reuise.web.backend.bare.table.TableFooter;
import dev.reuise.web.backend.bare.table.TableFooterOptions;
import dev.reuise.web.backend.bare.table.TableHeader;
import dev.reuise.web.backend.bare.table.TableHeaderCell;
import dev.reuise.web.backend.bare.table.TableHeaderCellOptions;
import dev.reuise.web.backend.bare.table.TableHeaderOptions;
import dev.reuise.web.backend.bare.table.TableHeaderRow;
import dev.reuise.web.backend.bare.table.TableHeaderRowOptions;
import dev.reuise.web.backend.bare.table.TableOptions;
import dev.reuise.web.backend.bare.table.TableRow;
import dev.reuise.web.backend.bare.table.TableRowOptions;
import dev.reuise.web.backend.bare.tabs.Tab;
import dev.reuise.web.backend.bare.tabs.TabBar;
import dev.reuise.web.backend.bare.tabs.TabBarOptions;
import dev.reuise.web.backend.bare.tabs.TabOptions;
import dev.reuise.web.backend.bare.text.Heading;
import dev.reuise.web.backend.bare.text.HeadingOptions;
import dev.reuise.web.backend.bare.text.IconLabel;
import dev.reuise.web.backend.bare.text.IconLabelOptions;
import dev.reuise.web.backend.bare.text.InlineText;
import dev.reuise.web.backend.bare.text.InlineTextOptions;
import dev.reuise.web.backend.bare.text.Label;
import dev.reuise.web.backend.bare.text.LabelOptions;
import dev.reuise.web.backend.bare.text.LineBreak;
import dev.reuise.web.backend.bare.text.LineBreakOptions;
import dev.reuise.web.backend.bare.text.Paragraph;
import dev.reuise.web.backend.bare.text.ParagraphOptions;
import dev.reuise.web.backend.bare.text.RotatingText;
import dev.reuise.web.backend.bare.text.RotatingTextOptions;
import dev.reuise.web.backend.bare.text.Text;
import dev.reuise.web.backend.bare.text.TextBlock;
import dev.reuise.web.backend.bare.text.TextBlockOptions;
import dev.reuise.web.backend.bare.text.TextOptions;
import dev.reuise.web.backend.bare.topappbar.TopAppBar;
import dev.reuise.web.backend.bare.topappbar.TopAppBarOptions;
import dev.reuise.web.backend.bare.view.RouteLayout;
import dev.reuise.web.backend.bare.view.RouteLayoutOptions;
import dev.reuise.web.backend.bare.view.SheetRouteLayout;
import dev.reuise.web.backend.bare.view.SheetRouteLayoutOptions;
import dev.reuise.web.backend.bare.view.SheetView;
import dev.reuise.web.backend.bare.view.SheetViewOptions;
import dev.reuise.web.backend.bare.view.View;
import dev.reuise.web.backend.bare.view.ViewOptions;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponent;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentOptions;
import dev.reuise.web.backend.bottomappbar.WebBackendBottomAppBar;
import dev.reuise.web.backend.bottomappbar.WebBackendBottomAppBarOptions;
import dev.reuise.web.backend.button.WebBackendButton;
import dev.reuise.web.backend.button.WebBackendButtonBar;
import dev.reuise.web.backend.button.WebBackendButtonBarOptions;
import dev.reuise.web.backend.button.WebBackendButtonOptions;
import dev.reuise.web.backend.button.WebBackendIconButton;
import dev.reuise.web.backend.button.WebBackendIconButtonOptions;
import dev.reuise.web.backend.card.WebBackendCard;
import dev.reuise.web.backend.card.WebBackendCardGrid;
import dev.reuise.web.backend.card.WebBackendCardGridOptions;
import dev.reuise.web.backend.card.WebBackendCardOptions;
import dev.reuise.web.backend.carousel.WebBackendCarousel;
import dev.reuise.web.backend.carousel.WebBackendCarouselCard;
import dev.reuise.web.backend.carousel.WebBackendCarouselCardOptions;
import dev.reuise.web.backend.carousel.WebBackendCarouselOptions;
import dev.reuise.web.backend.chat.WebBackendChatBox;
import dev.reuise.web.backend.chat.WebBackendChatBoxOptions;
import dev.reuise.web.backend.checkbox.WebBackendBasicCheckbox;
import dev.reuise.web.backend.checkbox.WebBackendBasicCheckboxOptions;
import dev.reuise.web.backend.checkbox.WebBackendCheckbox;
import dev.reuise.web.backend.checkbox.WebBackendCheckboxOptions;
import dev.reuise.web.backend.chip.WebBackendChip;
import dev.reuise.web.backend.chip.WebBackendChipGroup;
import dev.reuise.web.backend.chip.WebBackendChipGroupOptions;
import dev.reuise.web.backend.chip.WebBackendChipOptions;
import dev.reuise.web.backend.chip.WebBackendFilterChip;
import dev.reuise.web.backend.chip.WebBackendFilterChipOptions;
import dev.reuise.web.backend.consent.WebBackendConsentBanner;
import dev.reuise.web.backend.consent.WebBackendConsentBannerOptions;
import dev.reuise.web.backend.currencyselector.WebBackendCurrencySelector;
import dev.reuise.web.backend.currencyselector.WebBackendCurrencySelectorOptions;
import dev.reuise.web.backend.dialog.WebBackendDialog;
import dev.reuise.web.backend.dialog.WebBackendDialogOptions;
import dev.reuise.web.backend.dialog.WebBackendMessageDialog;
import dev.reuise.web.backend.dialog.WebBackendMessageDialogOptions;
import dev.reuise.web.backend.divider.WebBackendDivider;
import dev.reuise.web.backend.divider.WebBackendDividerOptions;
import dev.reuise.web.backend.document.WebBackendDocument;
import dev.reuise.web.backend.document.WebBackendDocumentBody;
import dev.reuise.web.backend.document.WebBackendDocumentBodyOptions;
import dev.reuise.web.backend.document.WebBackendDocumentOptions;
import dev.reuise.web.backend.drawer.WebBackendDrawer;
import dev.reuise.web.backend.drawer.WebBackendDrawerOptions;
import dev.reuise.web.backend.dropzone.WebBackendDropZone;
import dev.reuise.web.backend.dropzone.WebBackendDropZoneOptions;
import dev.reuise.web.backend.filepicker.WebBackendFilePicker;
import dev.reuise.web.backend.filepicker.WebBackendFilePickerOptions;
import dev.reuise.web.backend.floating.WebBackendFloatingActionButton;
import dev.reuise.web.backend.floating.WebBackendFloatingActionButtonOptions;
import dev.reuise.web.backend.floating.WebBackendFloatingPanel;
import dev.reuise.web.backend.floating.WebBackendFloatingPanelOptions;
import dev.reuise.web.backend.graphics.svg.WebBackendSvg;
import dev.reuise.web.backend.graphics.svg.WebBackendSvgGroup;
import dev.reuise.web.backend.graphics.svg.WebBackendSvgGroupOptions;
import dev.reuise.web.backend.graphics.svg.WebBackendSvgImage;
import dev.reuise.web.backend.graphics.svg.WebBackendSvgImageOptions;
import dev.reuise.web.backend.graphics.svg.WebBackendSvgOptions;
import dev.reuise.web.backend.graphics.svg.WebBackendSvgPath;
import dev.reuise.web.backend.graphics.svg.WebBackendSvgPathOptions;
import dev.reuise.web.backend.graphics.svg.WebBackendSvgRect;
import dev.reuise.web.backend.graphics.svg.WebBackendSvgRectOptions;
import dev.reuise.web.backend.graphics.svg.WebBackendSvgShape;
import dev.reuise.web.backend.graphics.svg.WebBackendSvgShapeOptions;
import dev.reuise.web.backend.graphics.svg.WebBackendSvgText;
import dev.reuise.web.backend.graphics.svg.WebBackendSvgTextOptions;
import dev.reuise.web.backend.icon.WebBackendIcon;
import dev.reuise.web.backend.icon.WebBackendIconOptions;
import dev.reuise.web.backend.image.WebBackendImage;
import dev.reuise.web.backend.image.WebBackendImageOptions;
import dev.reuise.web.backend.input.WebBackendBasicInputField;
import dev.reuise.web.backend.input.WebBackendBasicInputFieldOptions;
import dev.reuise.web.backend.input.WebBackendChipField;
import dev.reuise.web.backend.input.WebBackendChipFieldOptions;
import dev.reuise.web.backend.input.WebBackendMultiEmailAddressField;
import dev.reuise.web.backend.input.WebBackendMultiEmailAddressFieldOptions;
import dev.reuise.web.backend.input.WebBackendPasswordField;
import dev.reuise.web.backend.input.WebBackendPasswordFieldOptions;
import dev.reuise.web.backend.input.WebBackendSearchField;
import dev.reuise.web.backend.input.WebBackendSearchFieldOptions;
import dev.reuise.web.backend.input.WebBackendSegmentedTextField;
import dev.reuise.web.backend.input.WebBackendSegmentedTextFieldOptions;
import dev.reuise.web.backend.input.WebBackendTextField;
import dev.reuise.web.backend.input.WebBackendTextFieldOptions;
import dev.reuise.web.backend.layout.WebBackendColumnLayout;
import dev.reuise.web.backend.layout.WebBackendColumnLayoutOptions;
import dev.reuise.web.backend.layout.WebBackendContainer;
import dev.reuise.web.backend.layout.WebBackendContainerOptions;
import dev.reuise.web.backend.layout.WebBackendFieldSet;
import dev.reuise.web.backend.layout.WebBackendFieldSetOptions;
import dev.reuise.web.backend.layout.WebBackendFlexContainer;
import dev.reuise.web.backend.layout.WebBackendFlexContainerOptions;
import dev.reuise.web.backend.layout.WebBackendRowLayout;
import dev.reuise.web.backend.layout.WebBackendRowLayoutOptions;
import dev.reuise.web.backend.layout.WebBackendSheetLayout;
import dev.reuise.web.backend.layout.WebBackendSheetLayoutOptions;
import dev.reuise.web.backend.layout.WebBackendSurface;
import dev.reuise.web.backend.layout.WebBackendSurfaceOptions;
import dev.reuise.web.backend.link.WebBackendLink;
import dev.reuise.web.backend.link.WebBackendLinkOptions;
import dev.reuise.web.backend.link.WebBackendNavigationLink;
import dev.reuise.web.backend.link.WebBackendNavigationLinkOptions;
import dev.reuise.web.backend.list.WebBackendBasicList;
import dev.reuise.web.backend.list.WebBackendBasicListItem;
import dev.reuise.web.backend.list.WebBackendBasicListItemOptions;
import dev.reuise.web.backend.list.WebBackendBasicListOptions;
import dev.reuise.web.backend.list.WebBackendListItem;
import dev.reuise.web.backend.list.WebBackendListItemOptions;
import dev.reuise.web.backend.list.WebBackendListView;
import dev.reuise.web.backend.list.WebBackendListViewOptions;
import dev.reuise.web.backend.media.WebBackendAudioPlayer;
import dev.reuise.web.backend.media.WebBackendAudioPlayerOptions;
import dev.reuise.web.backend.media.WebBackendMediaPlayer;
import dev.reuise.web.backend.media.WebBackendMediaPlayerOptions;
import dev.reuise.web.backend.media.WebBackendTextTrack;
import dev.reuise.web.backend.media.WebBackendTextTrackOptions;
import dev.reuise.web.backend.media.WebBackendVideoPlayer;
import dev.reuise.web.backend.media.WebBackendVideoPlayerOptions;
import dev.reuise.web.backend.menu.WebBackendMenu;
import dev.reuise.web.backend.menu.WebBackendMenuButton;
import dev.reuise.web.backend.menu.WebBackendMenuButtonItem;
import dev.reuise.web.backend.menu.WebBackendMenuButtonItemOptions;
import dev.reuise.web.backend.menu.WebBackendMenuButtonOptions;
import dev.reuise.web.backend.menu.WebBackendMenuDivider;
import dev.reuise.web.backend.menu.WebBackendMenuDividerOptions;
import dev.reuise.web.backend.menu.WebBackendMenuItem;
import dev.reuise.web.backend.menu.WebBackendMenuItemOptions;
import dev.reuise.web.backend.menu.WebBackendMenuOptions;
import dev.reuise.web.backend.navigation.WebBackendNavigationTree;
import dev.reuise.web.backend.navigation.WebBackendNavigationTreeGroup;
import dev.reuise.web.backend.navigation.WebBackendNavigationTreeGroupOptions;
import dev.reuise.web.backend.navigation.WebBackendNavigationTreeLink;
import dev.reuise.web.backend.navigation.WebBackendNavigationTreeLinkOptions;
import dev.reuise.web.backend.navigation.WebBackendNavigationTreeOptions;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponent;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentOptions;
import dev.reuise.web.backend.progressindicator.WebBackendProgressIndicator;
import dev.reuise.web.backend.progressindicator.WebBackendProgressIndicatorOptions;
import dev.reuise.web.backend.regionselector.WebBackendRegionSelector;
import dev.reuise.web.backend.regionselector.WebBackendRegionSelectorOptions;
import dev.reuise.web.backend.scriptcomponent.WebBackendScriptComponent;
import dev.reuise.web.backend.scriptcomponent.WebBackendScriptComponentOptions;
import dev.reuise.web.backend.scrollablecontainer.WebBackendScrollableContainer;
import dev.reuise.web.backend.scrollablecontainer.WebBackendScrollableContainerEdge;
import dev.reuise.web.backend.scrollablecontainer.WebBackendScrollableContainerEdgeOptions;
import dev.reuise.web.backend.scrollablecontainer.WebBackendScrollableContainerOptions;
import dev.reuise.web.backend.scrollablecontainer.WebBackendScrollableContainerScrollArea;
import dev.reuise.web.backend.scrollablecontainer.WebBackendScrollableContainerScrollAreaOptions;
import dev.reuise.web.backend.selectmenu.WebBackendSelectMenu;
import dev.reuise.web.backend.selectmenu.WebBackendSelectMenuOptions;
import dev.reuise.web.backend.skeleton.WebBackendSkeleton;
import dev.reuise.web.backend.skeleton.WebBackendSkeletonOptions;
import dev.reuise.web.backend.slidecontainer.WebBackendSlideContainer;
import dev.reuise.web.backend.slidecontainer.WebBackendSlideContainerEdge;
import dev.reuise.web.backend.slidecontainer.WebBackendSlideContainerEdgeOptions;
import dev.reuise.web.backend.slidecontainer.WebBackendSlideContainerOptions;
import dev.reuise.web.backend.splitcontainer.WebBackendSplitContainer;
import dev.reuise.web.backend.splitcontainer.WebBackendSplitContainerDivider;
import dev.reuise.web.backend.splitcontainer.WebBackendSplitContainerDividerOptions;
import dev.reuise.web.backend.splitcontainer.WebBackendSplitContainerOptions;
import dev.reuise.web.backend.splitcontainer.WebBackendSplitContainerPanel;
import dev.reuise.web.backend.splitcontainer.WebBackendSplitContainerPanelOptions;
import dev.reuise.web.backend.table.WebBackendCheckboxTableCell;
import dev.reuise.web.backend.table.WebBackendCheckboxTableCellOptions;
import dev.reuise.web.backend.table.WebBackendCheckboxTableColumn;
import dev.reuise.web.backend.table.WebBackendCheckboxTableColumnOptions;
import dev.reuise.web.backend.table.WebBackendTable;
import dev.reuise.web.backend.table.WebBackendTableBody;
import dev.reuise.web.backend.table.WebBackendTableBodyOptions;
import dev.reuise.web.backend.table.WebBackendTableCell;
import dev.reuise.web.backend.table.WebBackendTableCellOptions;
import dev.reuise.web.backend.table.WebBackendTableColumn;
import dev.reuise.web.backend.table.WebBackendTableColumnGroup;
import dev.reuise.web.backend.table.WebBackendTableColumnGroupOptions;
import dev.reuise.web.backend.table.WebBackendTableColumnOptions;
import dev.reuise.web.backend.table.WebBackendTableFooter;
import dev.reuise.web.backend.table.WebBackendTableFooterOptions;
import dev.reuise.web.backend.table.WebBackendTableHeader;
import dev.reuise.web.backend.table.WebBackendTableHeaderCell;
import dev.reuise.web.backend.table.WebBackendTableHeaderCellOptions;
import dev.reuise.web.backend.table.WebBackendTableHeaderOptions;
import dev.reuise.web.backend.table.WebBackendTableHeaderRow;
import dev.reuise.web.backend.table.WebBackendTableHeaderRowOptions;
import dev.reuise.web.backend.table.WebBackendTableOptions;
import dev.reuise.web.backend.table.WebBackendTableRow;
import dev.reuise.web.backend.table.WebBackendTableRowOptions;
import dev.reuise.web.backend.tabs.WebBackendTab;
import dev.reuise.web.backend.tabs.WebBackendTabBar;
import dev.reuise.web.backend.tabs.WebBackendTabBarOptions;
import dev.reuise.web.backend.tabs.WebBackendTabOptions;
import dev.reuise.web.backend.text.WebBackendHeading;
import dev.reuise.web.backend.text.WebBackendHeadingOptions;
import dev.reuise.web.backend.text.WebBackendIconLabel;
import dev.reuise.web.backend.text.WebBackendIconLabelOptions;
import dev.reuise.web.backend.text.WebBackendInlineText;
import dev.reuise.web.backend.text.WebBackendInlineTextOptions;
import dev.reuise.web.backend.text.WebBackendLabel;
import dev.reuise.web.backend.text.WebBackendLabelOptions;
import dev.reuise.web.backend.text.WebBackendLineBreak;
import dev.reuise.web.backend.text.WebBackendLineBreakOptions;
import dev.reuise.web.backend.text.WebBackendParagraph;
import dev.reuise.web.backend.text.WebBackendParagraphOptions;
import dev.reuise.web.backend.text.WebBackendRotatingText;
import dev.reuise.web.backend.text.WebBackendRotatingTextOptions;
import dev.reuise.web.backend.text.WebBackendText;
import dev.reuise.web.backend.text.WebBackendTextBlock;
import dev.reuise.web.backend.text.WebBackendTextBlockOptions;
import dev.reuise.web.backend.text.WebBackendTextOptions;
import dev.reuise.web.backend.topappbar.WebBackendTopAppBar;
import dev.reuise.web.backend.topappbar.WebBackendTopAppBarOptions;
import dev.reuise.web.backend.view.WebBackendRouteLayout;
import dev.reuise.web.backend.view.WebBackendRouteLayoutOptions;
import dev.reuise.web.backend.view.WebBackendSheetRouteLayout;
import dev.reuise.web.backend.view.WebBackendSheetRouteLayoutOptions;
import dev.reuise.web.backend.view.WebBackendSheetView;
import dev.reuise.web.backend.view.WebBackendSheetViewOptions;
import dev.reuise.web.backend.view.WebBackendView;
import dev.reuise.web.backend.view.WebBackendViewOptions;
import dev.reuise.web.core.document.WebDocumentBodyOptions;
import dev.reuise.web.core.document.WebDocumentOptions;
import dev.reuise.web.core.filepicker.WebFilePickerOptions;
import dev.reuise.web.core.graphics.svg.WebSvgGroupOptions;
import dev.reuise.web.core.graphics.svg.WebSvgImageOptions;
import dev.reuise.web.core.graphics.svg.WebSvgOptions;
import dev.reuise.web.core.graphics.svg.WebSvgPathOptions;
import dev.reuise.web.core.graphics.svg.WebSvgRectOptions;
import dev.reuise.web.core.graphics.svg.WebSvgShapeOptions;
import dev.reuise.web.core.graphics.svg.WebSvgTextOptions;
import dev.reuise.web.core.scriptcomponent.WebScriptComponentOptions;
import dev.reuise.web.core.view.WebRouteLayoutOptions;
import dev.reuise.web.core.view.WebSheetRouteLayoutOptions;
import dev.reuise.webstyles.StyleSheet;
public class DefaultComponentFactory implements WebBackendComponentFactory {
    private static final DefaultComponentFactory instance = new DefaultComponentFactory();

    private RootComponent rootComponent;

    public DefaultComponentFactory() {
    }

    public static DefaultComponentFactory get() {
        return instance;
    }

    @Override
    public WebBackendIconLabel createIconLabel(CoreIconLabelOptions options) {
        return new IconLabel(((IconLabelOptions) (options)));
    }

    @Override
    public WebBackendIconLabelOptions createIconLabelOptions() {
        return new IconLabelOptions();
    }

    @Override
    public WebBackendSelectMenu createSelectMenu(CoreSelectMenuOptions options) {
        return new SelectMenu(((SelectMenuOptions) (options)));
    }

    @Override
    public WebBackendSelectMenuOptions createSelectMenuOptions() {
        return new SelectMenuOptions();
    }

    @Override
    public WebBackendAudioPlayer createAudioPlayer(CoreAudioPlayerOptions options) {
        return new AudioPlayer(((AudioPlayerOptions) (options)));
    }

    @Override
    public WebBackendAudioPlayerOptions createAudioPlayerOptions() {
        return new AudioPlayerOptions();
    }

    @Override
    public WebBackendCurrencySelector createCurrencySelector(CoreCurrencySelectorOptions options) {
        return new CurrencySelector(((CurrencySelectorOptions) (options)));
    }

    @Override
    public WebBackendCurrencySelectorOptions createCurrencySelectorOptions() {
        return new CurrencySelectorOptions();
    }

    @Override
    public WebBackendCheckboxTableCell createCheckboxTableCell(CoreCheckboxTableCellOptions options) {
        return new CheckboxTableCell(((CheckboxTableCellOptions) (options)));
    }

    @Override
    public WebBackendCheckboxTableCellOptions createCheckboxTableCellOptions() {
        return new CheckboxTableCellOptions();
    }

    @Override
    public WebBackendBasicList createBasicList(CoreBasicListOptions options) {
        return new BasicList(((BasicListOptions) (options)));
    }

    @Override
    public WebBackendBasicListOptions createBasicListOptions() {
        return new BasicListOptions();
    }

    @Override
    public WebBackendDocument createDocument(WebDocumentOptions options) {
        return new Document(((DocumentOptions) (options)));
    }

    @Override
    public WebBackendDocumentOptions createDocumentOptions() {
        return new DocumentOptions();
    }

    @Override
    public WebBackendSvgImage createSvgImage(WebSvgImageOptions options) {
        return new SvgImage(((SvgImageOptions) (options)));
    }

    @Override
    public WebBackendSvgImageOptions createSvgImageOptions() {
        return new SvgImageOptions();
    }

    @Override
    public WebBackendSheetLayout createSheetLayout(CoreSheetLayoutOptions options) {
        return new SheetLayout(((SheetLayoutOptions) (options)));
    }

    @Override
    public WebBackendSheetLayoutOptions createSheetLayoutOptions() {
        return new SheetLayoutOptions();
    }

    @Override
    public WebBackendView createView(CoreViewOptions options) {
        return new View(((ViewOptions) (options)));
    }

    @Override
    public WebBackendViewOptions createViewOptions() {
        return new ViewOptions();
    }

    @Override
    public WebBackendScriptComponent createScriptComponent(WebScriptComponentOptions options) {
        return new ScriptComponent(((ScriptComponentOptions) (options)));
    }

    @Override
    public WebBackendScriptComponentOptions createScriptComponentOptions() {
        return new ScriptComponentOptions();
    }

    @Override
    public WebBackendAccordionItem createAccordionItem(CoreAccordionItemOptions options) {
        return new AccordionItem(((AccordionItemOptions) (options)));
    }

    @Override
    public WebBackendAccordionItemOptions createAccordionItemOptions() {
        return new AccordionItemOptions();
    }

    @Override
    public WebBackendFloatingActionButton createFloatingActionButton(CoreFloatingActionButtonOptions options) {
        return new FloatingActionButton(((FloatingActionButtonOptions) (options)));
    }

    @Override
    public WebBackendFloatingActionButtonOptions createFloatingActionButtonOptions() {
        return new FloatingActionButtonOptions();
    }

    @Override
    public WebBackendChip createChip(CoreChipOptions options) {
        return new Chip(((ChipOptions) (options)));
    }

    @Override
    public WebBackendChipOptions createChipOptions() {
        return new ChipOptions();
    }

    @Override
    public WebBackendDocumentBody createDocumentBody(WebDocumentBodyOptions options) {
        return new DocumentBody(((DocumentBodyOptions) (options)));
    }

    @Override
    public WebBackendDocumentBodyOptions createDocumentBodyOptions() {
        return new DocumentBodyOptions();
    }

    @Override
    public WebBackendTopAppBar createTopAppBar(CoreTopAppBarOptions options) {
        return new TopAppBar(((TopAppBarOptions) (options)));
    }

    @Override
    public WebBackendTopAppBarOptions createTopAppBarOptions() {
        return new TopAppBarOptions();
    }

    @Override
    public WebBackendNavigationTree createNavigationTree(CoreNavigationTreeOptions options) {
        return new NavigationTree(((NavigationTreeOptions) (options)));
    }

    @Override
    public WebBackendNavigationTreeOptions createNavigationTreeOptions() {
        return new NavigationTreeOptions();
    }

    @Override
    public WebBackendSheetView createSheetView(CoreSheetViewOptions options) {
        return new SheetView(((SheetViewOptions) (options)));
    }

    @Override
    public WebBackendSheetViewOptions createSheetViewOptions() {
        return new SheetViewOptions();
    }

    @Override
    public WebBackendListView createListView(CoreListViewOptions options) {
        return new ListView(((ListViewOptions) (options)));
    }

    @Override
    public WebBackendListViewOptions createListViewOptions() {
        return new ListViewOptions();
    }

    @Override
    public WebBackendTableColumnGroup createTableColumnGroup(CoreTableColumnGroupOptions options) {
        return new TableColumnGroup(((TableColumnGroupOptions) (options)));
    }

    @Override
    public WebBackendTableColumnGroupOptions createTableColumnGroupOptions() {
        return new TableColumnGroupOptions();
    }

    @Override
    public WebBackendTableHeader createTableHeader(CoreTableHeaderOptions options) {
        return new TableHeader(((TableHeaderOptions) (options)));
    }

    @Override
    public WebBackendTableHeaderOptions createTableHeaderOptions() {
        return new TableHeaderOptions();
    }

    @Override
    public WebBackendChatBox createChatBox(CoreChatBoxOptions options) {
        return new ChatBox(((ChatBoxOptions) (options)));
    }

    @Override
    public WebBackendChatBoxOptions createChatBoxOptions() {
        return new ChatBoxOptions();
    }

    @Override
    public WebBackendButton createButton(CoreButtonOptions options) {
        return new Button(((ButtonOptions) (options)));
    }

    @Override
    public WebBackendButtonOptions createButtonOptions() {
        return new ButtonOptions();
    }

    @Override
    public WebBackendAppLayoutBody createAppLayoutBody(CoreAppLayoutBodyOptions options) {
        return new AppLayoutBody(((AppLayoutBodyOptions) (options)));
    }

    @Override
    public WebBackendAppLayoutBodyOptions createAppLayoutBodyOptions() {
        return new AppLayoutBodyOptions();
    }

    @Override
    public WebBackendParentComponent createParentComponent(CoreParentComponentPartOptions options) {
        return new ParentComponent(((ParentComponentOptions) (options)));
    }

    @Override
    public WebBackendParentComponentOptions createParentComponentOptions() {
        return new ParentComponentOptions();
    }

    @Override
    public WebBackendSlideContainerEdge createSlideContainerEdge(CoreSlideContainerEdgeOptions options) {
        return new SlideContainerEdge(((SlideContainerEdgeOptions) (options)));
    }

    @Override
    public WebBackendSlideContainerEdgeOptions createSlideContainerEdgeOptions() {
        return new SlideContainerEdgeOptions();
    }

    @Override
    public WebBackendCarouselCard createCarouselCard(CoreCarouselCardOptions options) {
        return new CarouselCard(((CarouselCardOptions) (options)));
    }

    @Override
    public WebBackendCarouselCardOptions createCarouselCardOptions() {
        return new CarouselCardOptions();
    }

    @Override
    public WebBackendSkeleton createSkeleton(CoreSkeletonOptions options) {
        return new Skeleton(((SkeletonOptions) (options)));
    }

    @Override
    public WebBackendSkeletonOptions createSkeletonOptions() {
        return new SkeletonOptions();
    }

    @Override
    public WebBackendScrollableContainer createScrollableContainer(CoreScrollableContainerOptions options) {
        return new ScrollableContainer(((ScrollableContainerOptions) (options)));
    }

    @Override
    public WebBackendScrollableContainerOptions createScrollableContainerOptions() {
        return new ScrollableContainerOptions();
    }

    @Override
    public WebBackendFilterChip createFilterChip(CoreFilterChipOptions options) {
        return new FilterChip(((FilterChipOptions) (options)));
    }

    @Override
    public WebBackendFilterChipOptions createFilterChipOptions() {
        return new FilterChipOptions();
    }

    @Override
    public WebBackendTab createTab(CoreTabOptions options) {
        return new Tab(((TabOptions) (options)));
    }

    @Override
    public WebBackendTabOptions createTabOptions() {
        return new TabOptions();
    }

    @Override
    public WebBackendSplitContainerDivider createSplitContainerDivider(CoreSplitContainerDividerOptions options) {
        return new SplitContainerDivider(((SplitContainerDividerOptions) (options)));
    }

    @Override
    public WebBackendSplitContainerDividerOptions createSplitContainerDividerOptions() {
        return new SplitContainerDividerOptions();
    }

    @Override
    public WebBackendNavigationLink createNavigationLink(CoreNavigationLinkOptions options) {
        return new NavigationLink(((NavigationLinkOptions) (options)));
    }

    @Override
    public WebBackendNavigationLinkOptions createNavigationLinkOptions() {
        return new NavigationLinkOptions();
    }

    @Override
    public WebBackendTextTrack createTextTrack(CoreTextTrackOptions options) {
        return new TextTrack(((TextTrackOptions) (options)));
    }

    @Override
    public WebBackendTextTrackOptions createTextTrackOptions() {
        return new TextTrackOptions();
    }

    @Override
    public WebBackendMenuButtonItem createMenuButtonItem(CoreMenuButtonItemOptions options) {
        return new MenuButtonItem(((MenuButtonItemOptions) (options)));
    }

    @Override
    public WebBackendMenuButtonItemOptions createMenuButtonItemOptions() {
        return new MenuButtonItemOptions();
    }

    @Override
    public WebBackendParagraph createParagraph(CoreParagraphOptions options) {
        return new Paragraph(((ParagraphOptions) (options)));
    }

    @Override
    public WebBackendParagraphOptions createParagraphOptions() {
        return new ParagraphOptions();
    }

    @Override
    public WebBackendVideoPlayer createVideoPlayer(CoreVideoPlayerOptions options) {
        return new VideoPlayer(((VideoPlayerOptions) (options)));
    }

    @Override
    public WebBackendVideoPlayerOptions createVideoPlayerOptions() {
        return new VideoPlayerOptions();
    }

    @Override
    public WebBackendAccordion createAccordion(CoreAccordionOptions options) {
        return new Accordion(((AccordionOptions) (options)));
    }

    @Override
    public WebBackendAccordionOptions createAccordionOptions() {
        return new AccordionOptions();
    }

    @Override
    public WebBackendMenuItem createMenuItem(CoreMenuItemOptions options) {
        return new MenuItem(((MenuItemOptions) (options)));
    }

    @Override
    public WebBackendMenuItemOptions createMenuItemOptions() {
        return new MenuItemOptions();
    }

    @Override
    public WebBackendRouteLayout createRouteLayout(WebRouteLayoutOptions options) {
        return new RouteLayout(((RouteLayoutOptions) (options)));
    }

    @Override
    public WebBackendRouteLayoutOptions createRouteLayoutOptions() {
        return new RouteLayoutOptions();
    }

    @Override
    public WebBackendSplitContainer createSplitContainer(CoreSplitContainerOptions options) {
        return new SplitContainer(((SplitContainerOptions) (options)));
    }

    @Override
    public WebBackendSplitContainerOptions createSplitContainerOptions() {
        return new SplitContainerOptions();
    }

    @Override
    public WebBackendPasswordField createPasswordField(CorePasswordFieldOptions options) {
        return new PasswordField(((PasswordFieldOptions) (options)));
    }

    @Override
    public WebBackendPasswordFieldOptions createPasswordFieldOptions() {
        return new PasswordFieldOptions();
    }

    @Override
    public WebBackendMultiEmailAddressField createMultiEmailAddressField(CoreMultiEmailAddressFieldOptions options) {
        return new MultiEmailAddressField(((MultiEmailAddressFieldOptions) (options)));
    }

    @Override
    public WebBackendMultiEmailAddressFieldOptions createMultiEmailAddressFieldOptions() {
        return new MultiEmailAddressFieldOptions();
    }

    @Override
    public WebBackendMenu createMenu(CoreMenuOptions options) {
        return new Menu(((MenuOptions) (options)));
    }

    @Override
    public WebBackendMenuOptions createMenuOptions() {
        return new MenuOptions();
    }

    @Override
    public WebBackendTableHeaderRow createTableHeaderRow(CoreTableHeaderRowOptions options) {
        return new TableHeaderRow(((TableHeaderRowOptions) (options)));
    }

    @Override
    public WebBackendTableHeaderRowOptions createTableHeaderRowOptions() {
        return new TableHeaderRowOptions();
    }

    @Override
    public WebBackendScrollableContainerEdge createScrollableContainerEdge(CoreScrollableContainerEdgeOptions options) {
        return new ScrollableContainerEdge(((ScrollableContainerEdgeOptions) (options)));
    }

    @Override
    public WebBackendScrollableContainerEdgeOptions createScrollableContainerEdgeOptions() {
        return new ScrollableContainerEdgeOptions();
    }

    @Override
    public WebBackendText createText(CoreTextOptions options) {
        return new Text(((TextOptions) (options)));
    }

    @Override
    public WebBackendTextOptions createTextOptions() {
        return new TextOptions();
    }

    @Override
    public WebBackendSvgShape createSvgShape(WebSvgShapeOptions options) {
        return new SvgShape(((SvgShapeOptions) (options)));
    }

    @Override
    public WebBackendSvgShapeOptions createSvgShapeOptions() {
        return new SvgShapeOptions();
    }

    @Override
    public WebBackendButtonBar createButtonBar(CoreButtonBarOptions options) {
        return new ButtonBar(((ButtonBarOptions) (options)));
    }

    @Override
    public WebBackendButtonBarOptions createButtonBarOptions() {
        return new ButtonBarOptions();
    }

    @Override
    public WebBackendBadge createBadge(CoreBadgeOptions options) {
        return new Badge(((BadgeOptions) (options)));
    }

    @Override
    public WebBackendBadgeOptions createBadgeOptions() {
        return new BadgeOptions();
    }

    @Override
    public WebBackendSplitContainerPanel createSplitContainerPanel(CoreSplitContainerPanelOptions options) {
        return new SplitContainerPanel(((SplitContainerPanelOptions) (options)));
    }

    @Override
    public WebBackendSplitContainerPanelOptions createSplitContainerPanelOptions() {
        return new SplitContainerPanelOptions();
    }

    @Override
    public WebBackendCheckbox createCheckbox(CoreCheckboxOptions options) {
        return new Checkbox(((CheckboxOptions) (options)));
    }

    @Override
    public WebBackendCheckboxOptions createCheckboxOptions() {
        return new CheckboxOptions();
    }

    @Override
    public WebBackendAvatar createAvatar(CoreAvatarOptions options) {
        return new Avatar(((AvatarOptions) (options)));
    }

    @Override
    public WebBackendAvatarOptions createAvatarOptions() {
        return new AvatarOptions();
    }

    @Override
    public WebBackendRegionSelector createRegionSelector(CoreRegionSelectorOptions options) {
        return new RegionSelector(((RegionSelectorOptions) (options)));
    }

    @Override
    public WebBackendRegionSelectorOptions createRegionSelectorOptions() {
        return new RegionSelectorOptions();
    }

    @Override
    public WebBackendTextField createTextField(CoreTextFieldOptions options) {
        return new TextField(((TextFieldOptions) (options)));
    }

    @Override
    public WebBackendTextFieldOptions createTextFieldOptions() {
        return new TextFieldOptions();
    }

    @Override
    public WebBackendHeading createHeading(CoreHeadingOptions options) {
        return new Heading(((HeadingOptions) (options)));
    }

    @Override
    public WebBackendHeadingOptions createHeadingOptions() {
        return new HeadingOptions();
    }

    @Override
    public WebBackendTableFooter createTableFooter(CoreTableFooterOptions options) {
        return new TableFooter(((TableFooterOptions) (options)));
    }

    @Override
    public WebBackendTableFooterOptions createTableFooterOptions() {
        return new TableFooterOptions();
    }

    @Override
    public WebBackendTableColumn createTableColumn(CoreTableColumnOptions options) {
        return new TableColumn(((TableColumnOptions) (options)));
    }

    @Override
    public WebBackendTableColumnOptions createTableColumnOptions() {
        return new TableColumnOptions();
    }

    @Override
    public WebBackendSvg createSvg(WebSvgOptions options) {
        return new Svg(((SvgOptions) (options)));
    }

    @Override
    public WebBackendSvgOptions createSvgOptions() {
        return new SvgOptions();
    }

    @Override
    public WebBackendTabBar createTabBar(CoreTabBarOptions options) {
        return new TabBar(((TabBarOptions) (options)));
    }

    @Override
    public WebBackendTabBarOptions createTabBarOptions() {
        return new TabBarOptions();
    }

    @Override
    public WebBackendMessageDialog createMessageDialog(CoreMessageDialogOptions options) {
        return new MessageDialog(((MessageDialogOptions) (options)));
    }

    @Override
    public WebBackendMessageDialogOptions createMessageDialogOptions() {
        return new MessageDialogOptions();
    }

    @Override
    public WebBackendNavigationTreeGroup createNavigationTreeGroup(CoreNavigationTreeGroupOptions options) {
        return new NavigationTreeGroup(((NavigationTreeGroupOptions) (options)));
    }

    @Override
    public WebBackendNavigationTreeGroupOptions createNavigationTreeGroupOptions() {
        return new NavigationTreeGroupOptions();
    }

    @Override
    public WebBackendColumnLayout createColumnLayout(CoreColumnLayoutOptions options) {
        return new ColumnLayout(((ColumnLayoutOptions) (options)));
    }

    @Override
    public WebBackendColumnLayoutOptions createColumnLayoutOptions() {
        return new ColumnLayoutOptions();
    }

    @Override
    public WebBackendSearchField createSearchField(CoreSearchFieldOptions options) {
        return new SearchField(((SearchFieldOptions) (options)));
    }

    @Override
    public WebBackendSearchFieldOptions createSearchFieldOptions() {
        return new SearchFieldOptions();
    }

    @Override
    public WebBackendListItem createListItem(CoreListItemOptions options) {
        return new ListItem(((ListItemOptions) (options)));
    }

    @Override
    public WebBackendListItemOptions createListItemOptions() {
        return new ListItemOptions();
    }

    @Override
    public WebBackendInlineText createInlineText(CoreInlineTextOptions options) {
        return new InlineText(((InlineTextOptions) (options)));
    }

    @Override
    public WebBackendInlineTextOptions createInlineTextOptions() {
        return new InlineTextOptions();
    }

    @Override
    public WebBackendMenuDivider createMenuDivider(CoreMenuDividerOptions options) {
        return new MenuDivider(((MenuDividerOptions) (options)));
    }

    @Override
    public WebBackendMenuDividerOptions createMenuDividerOptions() {
        return new MenuDividerOptions();
    }

    @Override
    public WebBackendAppLayout createAppLayout(CoreAppLayoutOptions options) {
        return new AppLayout(((AppLayoutOptions) (options)));
    }

    @Override
    public WebBackendAppLayoutOptions createAppLayoutOptions() {
        return new AppLayoutOptions();
    }

    @Override
    public WebBackendMenuButton createMenuButton(CoreMenuButtonOptions options) {
        return new MenuButton(((MenuButtonOptions) (options)));
    }

    @Override
    public WebBackendMenuButtonOptions createMenuButtonOptions() {
        return new MenuButtonOptions();
    }

    @Override
    public WebBackendBanner createBanner(CoreBannerOptions options) {
        return new Banner(((BannerOptions) (options)));
    }

    @Override
    public WebBackendBannerOptions createBannerOptions() {
        return new BannerOptions();
    }

    @Override
    public WebBackendDivider createDivider(CoreDividerOptions options) {
        return new Divider(((DividerOptions) (options)));
    }

    @Override
    public WebBackendDividerOptions createDividerOptions() {
        return new DividerOptions();
    }

    @Override
    public WebBackendConsentBanner createConsentBanner(CoreConsentBannerOptions options) {
        return new ConsentBanner(((ConsentBannerOptions) (options)));
    }

    @Override
    public WebBackendConsentBannerOptions createConsentBannerOptions() {
        return new ConsentBannerOptions();
    }

    @Override
    public WebBackendCardGrid createCardGrid(CoreCardGridOptions options) {
        return new CardGrid(((CardGridOptions) (options)));
    }

    @Override
    public WebBackendCardGridOptions createCardGridOptions() {
        return new CardGridOptions();
    }

    @Override
    public WebBackendDialog createDialog(CoreDialogOptions options) {
        return new Dialog(((DialogOptions) (options)));
    }

    @Override
    public WebBackendDialogOptions createDialogOptions() {
        return new DialogOptions();
    }

    @Override
    public WebBackendSlideContainer createSlideContainer(CoreSlideContainerOptions options) {
        return new SlideContainer(((SlideContainerOptions) (options)));
    }

    @Override
    public WebBackendSlideContainerOptions createSlideContainerOptions() {
        return new SlideContainerOptions();
    }

    @Override
    public WebBackendIcon createIcon(CoreIconOptions options) {
        return new Icon(((IconOptions) (options)));
    }

    @Override
    public WebBackendIconOptions createIconOptions() {
        return new IconOptions();
    }

    @Override
    public WebBackendCarousel createCarousel(CoreCarouselOptions options) {
        return new Carousel(((CarouselOptions) (options)));
    }

    @Override
    public WebBackendCarouselOptions createCarouselOptions() {
        return new CarouselOptions();
    }

    @Override
    public WebBackendBasicInputField createBasicInputField(CoreBasicInputFieldOptions options) {
        return new BasicInputField(((BasicInputFieldOptions) (options)));
    }

    @Override
    public WebBackendBasicInputFieldOptions createBasicInputFieldOptions() {
        return new BasicInputFieldOptions();
    }

    @Override
    public WebBackendFilePicker createFilePicker(WebFilePickerOptions options) {
        return new FilePicker(((FilePickerOptions) (options)));
    }

    @Override
    public WebBackendFilePickerOptions createFilePickerOptions() {
        return new FilePickerOptions();
    }

    @Override
    public WebBackendSvgGroup createSvgGroup(WebSvgGroupOptions options) {
        return new SvgGroup(((SvgGroupOptions) (options)));
    }

    @Override
    public WebBackendSvgGroupOptions createSvgGroupOptions() {
        return new SvgGroupOptions();
    }

    @Override
    public WebBackendMediaPlayer createMediaPlayer(CoreMediaPlayerOptions options) {
        return new MediaPlayer(((MediaPlayerOptions) (options)));
    }

    @Override
    public WebBackendMediaPlayerOptions createMediaPlayerOptions() {
        return new MediaPlayerOptions();
    }

    @Override
    public WebBackendCard createCard(CoreCardOptions options) {
        return new Card(((CardOptions) (options)));
    }

    @Override
    public WebBackendCardOptions createCardOptions() {
        return new CardOptions();
    }

    @Override
    public WebBackendIconButton createIconButton(CoreIconButtonOptions options) {
        return new IconButton(((IconButtonOptions) (options)));
    }

    @Override
    public WebBackendIconButtonOptions createIconButtonOptions() {
        return new IconButtonOptions();
    }

    @Override
    public WebBackendRowLayout createRowLayout(CoreRowLayoutOptions options) {
        return new RowLayout(((RowLayoutOptions) (options)));
    }

    @Override
    public WebBackendRowLayoutOptions createRowLayoutOptions() {
        return new RowLayoutOptions();
    }

    @Override
    public WebBackendBasicCheckbox createBasicCheckbox(CoreBasicCheckboxOptions options) {
        return new BasicCheckbox(((BasicCheckboxOptions) (options)));
    }

    @Override
    public WebBackendBasicCheckboxOptions createBasicCheckboxOptions() {
        return new BasicCheckboxOptions();
    }

    @Override
    public WebBackendNavigationTreeLink createNavigationTreeLink(CoreNavigationTreeLinkOptions options) {
        return new NavigationTreeLink(((NavigationTreeLinkOptions) (options)));
    }

    @Override
    public WebBackendNavigationTreeLinkOptions createNavigationTreeLinkOptions() {
        return new NavigationTreeLinkOptions();
    }

    @Override
    public WebBackendTableBody createTableBody(CoreTableBodyOptions options) {
        return new TableBody(((TableBodyOptions) (options)));
    }

    @Override
    public WebBackendTableBodyOptions createTableBodyOptions() {
        return new TableBodyOptions();
    }

    @Override
    public WebBackendTextBlock createTextBlock(CoreTextBlockOptions options) {
        return new TextBlock(((TextBlockOptions) (options)));
    }

    @Override
    public WebBackendTextBlockOptions createTextBlockOptions() {
        return new TextBlockOptions();
    }

    @Override
    public WebBackendTableCell createTableCell(CoreTableCellOptions options) {
        return new TableCell(((TableCellOptions) (options)));
    }

    @Override
    public WebBackendTableCellOptions createTableCellOptions() {
        return new TableCellOptions();
    }

    @Override
    public WebBackendChipField createChipField(CoreChipFieldOptions options) {
        return new ChipField(((ChipFieldOptions) (options)));
    }

    @Override
    public WebBackendChipFieldOptions createChipFieldOptions() {
        return new ChipFieldOptions();
    }

    @Override
    public WebBackendLineBreak createLineBreak(CoreLineBreakOptions options) {
        return new LineBreak(((LineBreakOptions) (options)));
    }

    @Override
    public WebBackendLineBreakOptions createLineBreakOptions() {
        return new LineBreakOptions();
    }

    @Override
    public WebBackendSheetRouteLayout createSheetRouteLayout(WebSheetRouteLayoutOptions options) {
        return new SheetRouteLayout(((SheetRouteLayoutOptions) (options)));
    }

    @Override
    public WebBackendSheetRouteLayoutOptions createSheetRouteLayoutOptions() {
        return new SheetRouteLayoutOptions();
    }

    @Override
    public WebBackendBaseComponent createBaseComponent(CoreBaseComponentPartOptions options) {
        return new BaseComponent(((BaseComponentOptions) (options)));
    }

    @Override
    public WebBackendBaseComponentOptions createBaseComponentOptions() {
        return new BaseComponentOptions();
    }

    @Override
    public WebBackendCheckboxTableColumn createCheckboxTableColumn(CoreCheckboxTableColumnOptions options) {
        return new CheckboxTableColumn(((CheckboxTableColumnOptions) (options)));
    }

    @Override
    public WebBackendCheckboxTableColumnOptions createCheckboxTableColumnOptions() {
        return new CheckboxTableColumnOptions();
    }

    @Override
    public WebBackendSegmentedTextField createSegmentedTextField(CoreSegmentedTextFieldOptions options) {
        return new SegmentedTextField(((SegmentedTextFieldOptions) (options)));
    }

    @Override
    public WebBackendSegmentedTextFieldOptions createSegmentedTextFieldOptions() {
        return new SegmentedTextFieldOptions();
    }

    @Override
    public WebBackendTableRow createTableRow(CoreTableRowOptions options) {
        return new TableRow(((TableRowOptions) (options)));
    }

    @Override
    public WebBackendTableRowOptions createTableRowOptions() {
        return new TableRowOptions();
    }

    @Override
    public WebBackendProgressIndicator createProgressIndicator(CoreProgressIndicatorOptions options) {
        return new ProgressIndicator(((ProgressIndicatorOptions) (options)));
    }

    @Override
    public WebBackendProgressIndicatorOptions createProgressIndicatorOptions() {
        return new ProgressIndicatorOptions();
    }

    @Override
    public WebBackendSvgRect createSvgRect(WebSvgRectOptions options) {
        return new SvgRect(((SvgRectOptions) (options)));
    }

    @Override
    public WebBackendSvgRectOptions createSvgRectOptions() {
        return new SvgRectOptions();
    }

    @Override
    public WebBackendDropZone createDropZone(CoreDropZoneOptions options) {
        return new DropZone(((DropZoneOptions) (options)));
    }

    @Override
    public WebBackendDropZoneOptions createDropZoneOptions() {
        return new DropZoneOptions();
    }

    @Override
    public WebBackendImage createImage(CoreImageOptions options) {
        return new Image(((ImageOptions) (options)));
    }

    @Override
    public WebBackendImageOptions createImageOptions() {
        return new ImageOptions();
    }

    @Override
    public WebBackendLink createLink(CoreLinkOptions options) {
        return new Link(((LinkOptions) (options)));
    }

    @Override
    public WebBackendLinkOptions createLinkOptions() {
        return new LinkOptions();
    }

    @Override
    public WebBackendSvgPath createSvgPath(WebSvgPathOptions options) {
        return new SvgPath(((SvgPathOptions) (options)));
    }

    @Override
    public WebBackendSvgPathOptions createSvgPathOptions() {
        return new SvgPathOptions();
    }

    @Override
    public WebBackendFloatingPanel createFloatingPanel(CoreFloatingPanelOptions options) {
        return new FloatingPanel(((FloatingPanelOptions) (options)));
    }

    @Override
    public WebBackendFloatingPanelOptions createFloatingPanelOptions() {
        return new FloatingPanelOptions();
    }

    @Override
    public WebBackendContainer createContainer(CoreContainerOptions options) {
        return new Container(((ContainerOptions) (options)));
    }

    @Override
    public WebBackendContainerOptions createContainerOptions() {
        return new ContainerOptions();
    }

    @Override
    public WebBackendTableHeaderCell createTableHeaderCell(CoreTableHeaderCellOptions options) {
        return new TableHeaderCell(((TableHeaderCellOptions) (options)));
    }

    @Override
    public WebBackendTableHeaderCellOptions createTableHeaderCellOptions() {
        return new TableHeaderCellOptions();
    }

    @Override
    public WebBackendTable createTable(CoreTableOptions options) {
        return new Table(((TableOptions) (options)));
    }

    @Override
    public WebBackendTableOptions createTableOptions() {
        return new TableOptions();
    }

    @Override
    public WebBackendChipGroup createChipGroup(CoreChipGroupOptions options) {
        return new ChipGroup(((ChipGroupOptions) (options)));
    }

    @Override
    public WebBackendChipGroupOptions createChipGroupOptions() {
        return new ChipGroupOptions();
    }

    @Override
    public WebBackendBottomAppBar createBottomAppBar(CoreBottomAppBarOptions options) {
        return new BottomAppBar(((BottomAppBarOptions) (options)));
    }

    @Override
    public WebBackendBottomAppBarOptions createBottomAppBarOptions() {
        return new BottomAppBarOptions();
    }

    @Override
    public WebBackendFlexContainer createFlexContainer(CoreFlexContainerOptions options) {
        return new FlexContainer(((FlexContainerOptions) (options)));
    }

    @Override
    public WebBackendFlexContainerOptions createFlexContainerOptions() {
        return new FlexContainerOptions();
    }

    @Override
    public WebBackendBasicListItem createBasicListItem(CoreBasicListItemOptions options) {
        return new BasicListItem(((BasicListItemOptions) (options)));
    }

    @Override
    public WebBackendBasicListItemOptions createBasicListItemOptions() {
        return new BasicListItemOptions();
    }

    @Override
    public WebBackendScrollableContainerScrollArea createScrollableContainerScrollArea(CoreScrollableContainerScrollAreaOptions options) {
        return new ScrollableContainerScrollArea(((ScrollableContainerScrollAreaOptions) (options)));
    }

    @Override
    public WebBackendScrollableContainerScrollAreaOptions createScrollableContainerScrollAreaOptions() {
        return new ScrollableContainerScrollAreaOptions();
    }

    @Override
    public WebBackendFieldSet createFieldSet(CoreFieldSetOptions options) {
        return new FieldSet(((FieldSetOptions) (options)));
    }

    @Override
    public WebBackendFieldSetOptions createFieldSetOptions() {
        return new FieldSetOptions();
    }

    @Override
    public WebBackendRotatingText createRotatingText(CoreRotatingTextOptions options) {
        return new RotatingText(((RotatingTextOptions) (options)));
    }

    @Override
    public WebBackendRotatingTextOptions createRotatingTextOptions() {
        return new RotatingTextOptions();
    }

    @Override
    public WebBackendDrawer createDrawer(CoreDrawerOptions options) {
        return new Drawer(((DrawerOptions) (options)));
    }

    @Override
    public WebBackendDrawerOptions createDrawerOptions() {
        return new DrawerOptions();
    }

    @Override
    public WebBackendSvgText createSvgText(WebSvgTextOptions options) {
        return new SvgText(((SvgTextOptions) (options)));
    }

    @Override
    public WebBackendSvgTextOptions createSvgTextOptions() {
        return new SvgTextOptions();
    }

    @Override
    public WebBackendLabel createLabel(CoreLabelOptions options) {
        return new Label(((LabelOptions) (options)));
    }

    @Override
    public WebBackendLabelOptions createLabelOptions() {
        return new LabelOptions();
    }

    @Override
    public WebBackendSurface createSurface(CoreSurfaceOptions options) {
        return new Surface(((SurfaceOptions) (options)));
    }

    @Override
    public WebBackendSurfaceOptions createSurfaceOptions() {
        return new SurfaceOptions();
    }

    public void setRootComponent(RootComponent rootComponent) {
        dev.reuise.web.backend.WebBackendRootScope.set(rootComponent);
    }

    public RootComponent getRootComponent() {
        return dev.reuise.web.backend.WebBackendRootScope.get();
    }

    @Override
    public StyleSheet getCommonStyleSheet() {
        return null;
    }
}
